package com.licheedev.serialtool.comn;

import com.licheedev.serialtool.comn.message.LogManager;
import com.licheedev.serialtool.comn.message.SendMessage;
import com.licheedev.serialtool.util.ByteUtil;
import com.licheedev.serialtool.util.LogUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ProjectName: Android-SerialPort-Tool
 * @Package: com.licheedev.serialtool.comn
 * @ClassName: SerialWriteThread
 * @Author: xzg
 * @CreateDate: 2019/3/21 11:11
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/21 11:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public class SerialWriteThread extends Thread {
    private final static String TAG = SerialWriteThread.class.getSimpleName();
    static LinkedBlockingQueue<String> basket = new LinkedBlockingQueue<String>();
    private boolean iscloseStream;
    OutputStream mOutputStream;

    public SerialWriteThread(OutputStream outputStream) {
        iscloseStream = true;
        mOutputStream = outputStream;
    }

    /**
     * 生产者
     *
     * @throws InterruptedException
     */
    public   void produce(String produce) {
        // put方法放入一个苹果，若basket满了，等到basket有位置
        try {
            LogUtils.i(TAG, "basket===" + basket.size() + " produce=" + produce);
            basket.put(produce);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 消费者
     *
     * @return
     * @throws InterruptedException
     */
    public String consume() {
        // take方法取出一个苹果，若basket为空，等到basket有苹果为止(获取并移除此队列的头部)
        try {
            return basket.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void run() {
        String command = null;
        String commandContrast = null;
        try {

            while (basket!=null  ) {
                command=basket.take() ;
                Thread.sleep(100);
                LogUtils.i(TAG, "basket===" + basket.size() + " command=" + command);
                if (mOutputStream != null) {
                     // if(!command.equalsIgnoreCase(commandContrast)){
                        commandContrast=command;
                        byte[] bytes = ByteUtil.hexStr2bytes(command);
                        mOutputStream.write(bytes);
                        mOutputStream.flush();
                        LogManager.instance().post(new SendMessage(command));
                      //}

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 停止读线程
     */
    public void close() {
        LogUtils.i(TAG, "===========完成关闭流======iscloseStream=" + iscloseStream);
        iscloseStream = false;
        super.interrupt();
        if (mOutputStream != null) {
            try {
                mOutputStream.close();
                mOutputStream=null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        LogUtils.i(TAG, "===========完成关闭流======iscloseStream=" + iscloseStream);
    }
}
