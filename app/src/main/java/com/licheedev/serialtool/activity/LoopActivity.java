package com.licheedev.serialtool.activity;

import android.os.Bundle;

import com.licheedev.serialtool.R;
import com.licheedev.serialtool.activity.base.BaseActivity;
import com.licheedev.serialtool.bean.RecoveryTypeBean;
import com.licheedev.serialtool.comn.CommunicationInstruction;
import com.licheedev.serialtool.comn.SerialPortManager;
import com.licheedev.serialtool.util.LogUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: Android-SerialPort-Tool
 * @Package: com.licheedev.serialtool.activity
 * @ClassName: LoopActivity
 * @Author: xzg
 * @CreateDate: 2019/3/21 11:23
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/21 11:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public class LoopActivity extends BaseActivity {
    /**
     * 规定计时任务，定时退出
     */
    public static int currentTime = 0;
    public static int position = 0;
    private final static String TAG=LoadCmdListActivity.class.getSimpleName();
    List<RecoveryTypeBean> commands = new ArrayList<>();
    /**
     * 定时退出投递界面
     */
    ScheduledExecutorService executor;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_loop_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        commands = RecoveryTypeBean.getRecoveryTypeBean();

        executor = new ScheduledThreadPoolExecutor(1);
        long oneDay = 1000;
        //启动项目，initialDelay后开始执行程序，然后每过period时间周期性执行。
        //也就是第二次执行是在initialDelay+period执行。第三次执行在initialDelay+2*period执行
        executor.scheduleAtFixedRate(
                //第三步的线程类
                new TimeServer(),
                1,
                //两次执行行间的间隔（单位为毫秒）
                1,
                TimeUnit.SECONDS);
    }

    public class TimeServer implements Runnable {
        @Override
        public void run() {
            LogUtils.i(TAG,"===========TimeServer=============currentTime="+currentTime);

            if (currentTime == 0) {
                if(position>6){
                    position=0;
                }
                RecoveryTypeBean item = commands.get(position);
              /*  try {
                    //开门指令
                    String OpenTheWindow = CommunicationInstruction.sendOpenTheWindow(item);
                    SerialPortManager.instance().sendNewCommand(OpenTheWindow);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //读取重量指令
                String ReadWeighing = CommunicationInstruction.sendReadWeighingData(item);
                SerialPortManager.instance().sendNewCommand(ReadWeighing);
                //读取容量指令
                String Readcapacity = CommunicationInstruction.sendReadcapacitydata(item);
                SerialPortManager.instance().sendNewCommand(Readcapacity);*/

                try {
                    Thread.sleep(1000);
                    //关门指令
                    String ClosingWindow = CommunicationInstruction.sendClosingTheReleaseWindow(item);
                    SerialPortManager.instance().sendNewCommand(ClosingWindow);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            position++;
            if(currentTime==10){
                currentTime=0;
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executor.shutdown();
    }
}
