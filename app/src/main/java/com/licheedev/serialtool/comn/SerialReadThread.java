package com.licheedev.serialtool.comn;

import android.os.SystemClock;
import android.util.Log;

import com.licheedev.myutils.LogPlus;
import com.licheedev.serialtool.comn.message.LogManager;
import com.licheedev.serialtool.comn.message.RecvMessage;
import com.licheedev.serialtool.util.ByteUtil;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 读串口线程
 */
public class SerialReadThread extends Thread {

    private static final String TAG = "SerialReadThread";

    private BufferedInputStream mInputStream;


    public SerialReadThread(InputStream is) {
        mInputStream = new BufferedInputStream(is);
    }

    @Override
    public void run() {
        byte[] buffer = new byte[1024];
        //读取字符变量
        int ch = 0;
        LogPlus.e("开始读线程");
        int bytes;
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            try {
                int available = mInputStream.available();
                if (available > 0) {
                    bytes = 0;
                    while ((ch = mInputStream.read()) != '\n') {
                        //将读取到的字符写入
                        buffer[bytes] = (byte) ch;
                        bytes++;
                    }
                    //最后加上一个换行
                    buffer[bytes] = '\n';
                    bytes++;
                    onDataReceive(buffer, bytes);
                } else {
                    // 暂停一点时间，免得一直循环造成CPU占用率过高
                    SystemClock.sleep(1);
                }
            } catch (IOException e) {
                LogPlus.e("读取数据失败", e);
            } finally {
                //   LogPlus.e("finally 结束读进程");
            }
        }

    }

    /**
     * 处理获取到的数据
     *
     * @param received
     * @param size
     */
    private void onDataReceive(byte[] received, int size) {
        // TODO: 2018/3/22 解决粘包、分包等
        String hexStr = ByteUtil.bytes2HexStr(received, 0, size);
        String str3 = new String(received, 0, size);
        Log.i("YYYY", " hexStr=" + hexStr);
        Log.i("YYYY", "onDataReceive== str3=" + str3);
        LogManager.instance().post(new RecvMessage(str3));
    }

    /**
     * 停止读线程
     */
    public void close() {
        try {
            mInputStream.close();
        } catch (IOException e) {
            LogPlus.e("异常", e);
        } finally {
            super.interrupt();
        }
    }
}
