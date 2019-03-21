package com.licheedev.serialtool.comn;

/**
 * @ProjectName: Android-SerialPort-Tool
 * @Package: com.licheedev.serialtool.comn
 * @ClassName: FunctionCode
 * @Author: xzg
 * @CreateDate: 2019/3/21 11:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/21 11:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public class FunctionCode {
    public final static String FRAME_HEAD = "AABB";

    public final static String FRAME_TAIL = "CCDD";

    public final static String CHECKOUT_BIT = "69";
    /**
     * 红外感应指示灯
     */
    public final static String INFRARED_INDUCTION_LAMP = "3";

    /**
     * 从机1
     */
    public final static String DEVICE_ONE = "0001";
    /**
     * 串口协议从机1返回码
     */
    public final static String DEVICE_ONE_CODE = "1";
    /**
     * 从机2
     */
    public final static String DEVICE_TWO = "0002";
    /**
     * 串口协议从机2返回码
     */
    public final static String DEVICE_TWO_CODE = "2";


    /**
     * 红外检测机位
     */
    public final static String DEVICE_INFRARED_DETECTION = "0002";
    /**
     * 红外检测机位
     */
    public final static String DEVICE_INFRARED_DETECTION_CODE = "2";
    /**
     * 从机3
     */
    public final static String DEVICE_THREE = "0004";
    /**
     * 串口协议从机3返回码
     */
    public final static String DEVICE_THREE_CODE = "4";
    /**
     * 从机4
     */
    public final static String DEVICE_FOUR = "0008";
    /**
     * 串口协议从机4返回码
     */
    public final static String DEVICE_FOUR_CODE = "8";
    /**
     * 从机5
     */
    public final static String DEVICE_FIVE = "0010";
    /**
     * 串口协议从机5返回码
     */
    public final static String DEVICE_FIVE_CODE = "10";
    /**
     * 从机6
     */
    public final static String DEVICE_SIX = "0020";
    /**
     * 串口协议从机6返回码
     */
    public final static String DEVICE_SIX_CODE = "20";


    /**
     * 读取数据
     */
    public final static String READ = "0001";
    /**
     * 写入数据
     */
    public final static String WRITE = "0002";
    /**
     * 清除数据
     */
    public final static String ERASE = "0003";
    /**
     * 称重校准
     */
    public final static String CALIBRATION = "0004";
    /***=====================主机请求的数据定义=========start================**/
    /**
     * 计数器1 00 00:读最后一次的计数值
     */
    public final static String COUNTER_ONE = "0001";
    /**
     * 计数器2 00 00:读最后一次的计数值
     */
    public final static String COUNTER_TWO = "0002";
    /**
     * 人体检测 读取状态
     */
    public final static String HUMAN_BODY_DETECTION = "0003";
    /**
     * DOOR_SENSOR 读取状态
     */
    public final static String DOOR_SENSOR = "0004";
    /**
     * DOOR_LOCK 00 00:无动作    00 01:开锁
     */
    public final static String DOOR_LOCK = "0005";
    /**
     * WINDOW_LOCK 读取状态(投放窗口锁)
     */
    public final static String WINDOW_LOCK = "0006";
    /**
     * 超声波距离 先发功能码:write开始测距,后发read读距离
     */
    public final static String ULTRASONIC_DISTANCE = "0007";
    /**
     * 称重传感器 先发功能码:write开始称重,后发read读重量
     */
    public final static String WEIGHING_SENSOR = "0008";
    /**
     * 设备地址 编码地址:1,2,4,8,16,32,64,128
     */
    public final static String DEVICE_ADDRESS = "0009";
    /**
     * 电机1  0000:停止 00 01:正转 00 10:反转 00 11:停止
     */
    public final static String ELECTRIC_MACHINERY_ONE = "000A";
    /**
     * 电机2 0000:停止 00 01:正转 00 10:反转 00 11:停止
     */
    public final static String ELECTRIC_MACHINERY_TWO = "000B";
    /**
     * 电机3 0000:停止 00 01:正转 00 10:反转 00 11:停止
     */
    public final static String ELECTRIC_MACHINERY_THREE = "000C";
    /**
     * 开限位器1 功能码:READ读取状态 WRITE:清状态0
     */
    public final static String OPEN_LIMIT_DEVICE_ONE = "000D";
    /**
     * 关限位器1 功能码:READ读取状态 WRITE:清状态0
     */
    public final static String CLOSE_LIMIT_DEVICE_ONE = "000E";
    /**
     * 开限位器2 功能码:READ读取状态 WRITE:清状态0
     */
    public final static String OPEN_LIMIT_DEVICE_TWO = "000F";
    /**
     * 关限位器2 功能码:READ读取状态 WRITE:清状态0
     */
    public final static String CLOSE_LIMIT_DEVICE_TWO = "0010";
    /**
     * 开限位器3 功能码:READ读取状态 WRITE:清状态0
     */
    public final static String OPEN_LIMIT_DEVICE_THREE = "0011";
    /**
     * 关限位器3 功能码:READ读取状态 WRITE:清状态0
     */
    public final static String CLOSE_LIMIT_DEVICE_THREE = "0012";
    /**
     * 蜂鸣器 00 00:关闭    00 01:开启?????
     */
    public final static String BUZZER = "0013";
    /**
     * 心跳跳报 心跳
     */
    public final static String HEARTBEAT = "0014";
    /**
     * LED1_CTRL 00 00:关灯   00 01:开灯  (默认关灯)
     */
    public final static String LED1_CTRL = "0015";
    /**
     * LED2_CTRL 00 00:关灯   00 01:开灯  (默认关灯)
     */
    public final static String LED2_CTRL = "0016";
    /**
     * LED3_CTRL 00 00:关灯   00 01:开灯  (默认关灯)
     */
    public final static String LED3_CTRL = "0017";

    /**
     * 进步点击
     */
    public final static String STEPPER_MOTOR = "0018";
    /**
     * 电机停止
     */
    public final static String MOTOR_STOP = "0000";
    /**
     * 电机正转
     */
    public final static String MOTOR_POSITIVE = "0001";
    /**
     * 电机反转
     */
    public final static String MOTOR_REVERSAL = "0002";
    /**
     * 电机停止
     */
    public final static String MOTOR_STOP2 = "0011";
    /**
     * 电机状态忙
     */
    public final static String MOTOR_BUSY_STATE = "FFFF";
    /**
     * 左移
     */
    public final static String LEFT_SHIFT = "00A1";
    /**
     * 右移
     */
    public final static String RIGHT_SHIFT = "00A2";
    /**
     * 停止移动
     */
    public final static String STOP_SHIFT = "00A1";

    /**
     * 红外感应捕获从机位置1
     */
    public final static String SHIFT_ONE = "0001";
    /**
     * 红外感应捕获从机位置2
     */
    public final static String SHIFT_TWO = "0002";
    /**
     * 红外感应捕获从机位置3
     */

    public final static String SHIFT_THREE = "0003";
    /**
     * 红外感应捕获从机位置4
     */
    public final static String SHIFT_FOUR = "0004";
    /**
     * 红外感应捕获从机位置5
     */
    public final static String SHIFT_FIVE = "0005";
    /**
     * 红外感应捕获从机位置6
     */
    public final static String SHIFT_SIX = "0006";

}
