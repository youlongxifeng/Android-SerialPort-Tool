package com.licheedev.serialtool.comn;

import com.licheedev.serialtool.bean.RecoveryTypeBean;
import com.licheedev.serialtool.util.LogUtils;

/**
 * @ProjectName: Android-SerialPort-Tool
 * @Package: com.licheedev.serialtool.comn
 * @ClassName: CommunicationInstruction
 * @Author: xzg
 * @CreateDate: 2019/3/21 11:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/21 11:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （串口通信指令通信指令）
 */
public class CommunicationInstruction {
    private final static String TAG = CommunicationInstruction.class.getSimpleName();


    /**
     * 打开投放窗
     *
     * @param articleType
     */
    public static String sendOpenTheWindow(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = getSlaveAddress(articleType);
        //功能码
        String functionCode = FunctionCode.WRITE;
        //数据地址 电机1  0000:停止 00 01:正转 00 10:反转 00 11:停止
        String dataAddress = FunctionCode.ELECTRIC_MACHINERY_ONE;
        //数据 电机正转状态
        String data = FunctionCode.MOTOR_POSITIVE;
        //CRC校验位
        String checkoutBit = FunctionCode.CHECKOUT_BIT;
        LogUtils.i(TAG, "打开投放窗 slaveAddress=" + slaveAddress + "  dataAddress=" + dataAddress + " data=" + data + "  checkoutBit=" + checkoutBit);

        String command = FunctionCode.FRAME_HEAD + slaveAddress + functionCode + dataAddress + data + checkoutBit + FunctionCode.FRAME_TAIL;

        return command;
    }

    /**
     * 关闭投放窗
     *
     * @param articleType
     */
    public static String sendClosingTheReleaseWindow(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = getSlaveAddress(articleType);
        //功能码
        String functionCode = FunctionCode.WRITE;
        //数据地址 电机1  0000:停止 00 01:正转 00 10:反转 00 11:停止
        String dataAddress = FunctionCode.ELECTRIC_MACHINERY_ONE;
        // 数据电机反转状态
        String data = FunctionCode.MOTOR_REVERSAL;
        //CRC校验位
        String checkoutBit = FunctionCode.CHECKOUT_BIT;
        LogUtils.i(TAG, "关闭投放窗 slaveAddress=" + slaveAddress + "  dataAddress=" + dataAddress + " data=" + data + "  checkoutBit=" + checkoutBit);
        String command = FunctionCode.FRAME_HEAD + slaveAddress + functionCode + dataAddress + data + checkoutBit + FunctionCode.FRAME_TAIL;

        return command;
    }


    /**
     * 发送开始称重指令串口信息
     *
     * @param articleType
     */
    public static String sendWeighCommand(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = getSlaveAddress(articleType);
        //功能码
        String functionCode = FunctionCode.WRITE;
        //数据地址
        String dataAddress = FunctionCode.WEIGHING_SENSOR;
        //数据
        String data = FunctionCode.COUNTER_ONE;
        //CRC校验位
        String checkoutBit = FunctionCode.CHECKOUT_BIT;
        LogUtils.i(TAG, "发送开始称重指令串口信息 slaveAddress=" + slaveAddress + "  dataAddress=" + dataAddress + " data=" + data + "  checkoutBit=" + checkoutBit);

        String command = FunctionCode.FRAME_HEAD + slaveAddress + functionCode + dataAddress + data + checkoutBit + FunctionCode.FRAME_TAIL;

        return command;
    }

    /**
     * 读取称重数据
     *
     * @param articleType
     */
    public static String sendReadWeighingData(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = getSlaveAddress(articleType);
        //功能码
        String functionCode = FunctionCode.READ;
        //数据地址
        String dataAddress = FunctionCode.WEIGHING_SENSOR;
        //数据
        String data = FunctionCode.COUNTER_ONE;
        //CRC校验位
        String checkoutBit = FunctionCode.CHECKOUT_BIT;
        LogUtils.i(TAG, "读取称重数据 slaveAddress=" + slaveAddress + "  dataAddress=" + dataAddress + " data=" + data + "  checkoutBit=" + checkoutBit);
        String command = FunctionCode.FRAME_HEAD + slaveAddress + functionCode + dataAddress + data + checkoutBit + FunctionCode.FRAME_TAIL;

        return command;
    }


    /**
     * 开始测容量 先将数据写进去
     *
     * @param articleType
     */
    public static String sendStartMeasuringCapacity(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = getSlaveAddress(articleType);
        //功能码
        String functionCode = FunctionCode.WRITE;
        //数据地址
        String dataAddress = FunctionCode.ULTRASONIC_DISTANCE;
        //数据
        String data = FunctionCode.COUNTER_ONE;
        //CRC校验位
        String checkoutBit = FunctionCode.CHECKOUT_BIT;
        LogUtils.i(TAG, "开始测容量 slaveAddress=" + slaveAddress + "  dataAddress=" + dataAddress + " data=" + data + "  checkoutBit=" + checkoutBit);

        String command = FunctionCode.FRAME_HEAD + slaveAddress + functionCode + dataAddress + data + checkoutBit + FunctionCode.FRAME_TAIL;

        return command;
    }

    /**
     * 读取容量数据 再将数据读出来
     *
     * @param articleType
     */
    public static String sendReadcapacitydata(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = getSlaveAddress(articleType);
        //功能码
        String functionCode = FunctionCode.READ;
        //数据地址
        String dataAddress = FunctionCode.ULTRASONIC_DISTANCE;
        //数据
        String data = FunctionCode.COUNTER_ONE;
        //CRC校验位
        String checkoutBit = FunctionCode.CHECKOUT_BIT;
        LogUtils.i(TAG, "读取容量数据 slaveAddress=" + slaveAddress + "  dataAddress=" + dataAddress + " data=" + data + "  checkoutBit=" + checkoutBit);
        String command = FunctionCode.FRAME_HEAD + slaveAddress + functionCode + dataAddress + data + checkoutBit + FunctionCode.FRAME_TAIL;

        return command;
    }



    /**
     * 获取从机位
     *
     * @param articleType
     * @return
     */
    private static String getSlaveAddress(RecoveryTypeBean articleType) {
        //从机地址
        String slaveAddress = null;
        // switch (articleType.getCategoryId()) {
        switch (articleType.getSort()) {
            case 1:
                slaveAddress = FunctionCode.DEVICE_ONE;
                break;
            case 2:
                slaveAddress = FunctionCode.DEVICE_TWO;
                break;
            case 3:
                slaveAddress = FunctionCode.DEVICE_THREE;
                break;
            case 4:
                slaveAddress = FunctionCode.DEVICE_FOUR;
                break;
            case 5:
                slaveAddress = FunctionCode.DEVICE_FIVE;
                break;
            case 6:
                slaveAddress = FunctionCode.DEVICE_SIX;
                break;
            default:
                break;
        }
        return slaveAddress;
    }
}
