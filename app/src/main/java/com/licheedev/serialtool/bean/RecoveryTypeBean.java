package com.licheedev.serialtool.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Android-SerialPort-Tool
 * @Package: com.licheedev.serialtool.bean
 * @ClassName: RecoveryTypeBean
 * @Author: xzg
 * @CreateDate: 2019/3/21 11:18
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/3/21 11:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public class RecoveryTypeBean implements Serializable {
    /**
     * 回收类型
     */
    private String categoryId;
    /**
     * 回收名称
     */
    private String categoryName;

    /**
     * 回收名称
     */
    private String name;


    /**
     * 回收类型ID
     */
    private String dustbinBoxId;

    /**
     * 回收价格
     */
    private double deliveryPrice;

    private int dustbinId;

    /**
     * 回收图标名称
     */
    private String icon;

    private String imei;


    /**
     * 回收图标URL
     */
    private String iconFullName;


    /**
     * 维修时间记录
     */
    private String latestGuardedTime;


    /**
     * 容量  1表示100%  ，0.5表示50%
     */
    private double loading;

    /**
     * 回收箱序号
     */
    private int sort;


    /**
     * 报警状态
     */
    private String status;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDustbinBoxId() {
        return dustbinBoxId;
    }

    public void setDustbinBoxId(String dustbinBoxId) {
        this.dustbinBoxId = dustbinBoxId;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getDustbinId() {
        return dustbinId;
    }

    public void setDustbinId(int dustbinId) {
        this.dustbinId = dustbinId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIconFullName() {
        return iconFullName;
    }

    public void setIconFullName(String iconFullName) {
        this.iconFullName = iconFullName;
    }

    public String getLatestGuardedTime() {
        return latestGuardedTime;
    }

    public void setLatestGuardedTime(String latestGuardedTime) {
        this.latestGuardedTime = latestGuardedTime;
    }

    public double getLoading() {
        return loading;
    }

    public void setLoading(double loading) {
        this.loading = loading;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RecoveryTypeBean{" +
                "categoryId='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", name='" + name + '\'' +
                ", dustbinBoxId='" + dustbinBoxId + '\'' +
                ", deliveryPrice=" + deliveryPrice +
                ", dustbinId=" + dustbinId +
                ", icon='" + icon + '\'' +
                ", imei='" + imei + '\'' +
                ", iconFullName='" + iconFullName + '\'' +
                ", latestGuardedTime='" + latestGuardedTime + '\'' +
                ", loading=" + loading +
                ", sort=" + sort +
                ", status='" + status + '\'' +
                '}';
    }


    public static List<RecoveryTypeBean> getRecoveryTypeBean() {
        List<RecoveryTypeBean> recoveryTypeBeanList = new ArrayList<>();

        RecoveryTypeBean recoveryTypeBean1=new RecoveryTypeBean();
        recoveryTypeBean1.setDustbinBoxId("133");
        recoveryTypeBean1.setDustbinId(53);
        recoveryTypeBean1.setCategoryId("3");
        recoveryTypeBean1.setCategoryName("织物类");
        recoveryTypeBean1.setDeliveryPrice(0.5);
        recoveryTypeBean1.setSort(1);
        recoveryTypeBean1.setIcon("textile.png");
        recoveryTypeBean1.setIconFullName("http://192.168.2.48:3333/images/icon/category/textile.png");
        recoveryTypeBean1.setLoading(0);
        recoveryTypeBean1.setStatus("empty");


        RecoveryTypeBean recoveryTypeBean2=new RecoveryTypeBean();
        recoveryTypeBean2.setDustbinBoxId("133");
        recoveryTypeBean2.setDustbinId(53);
        recoveryTypeBean2.setCategoryId("3");
        recoveryTypeBean2.setCategoryName("织物类");
        recoveryTypeBean2.setDeliveryPrice(0.5);
        recoveryTypeBean2.setSort(2);
        recoveryTypeBean2.setIcon("textile.png");
        recoveryTypeBean2.setIconFullName("http://192.168.2.48:3333/images/icon/category/textile.png");
        recoveryTypeBean2.setLoading(0);
        recoveryTypeBean2.setStatus("empty");
        RecoveryTypeBean recoveryTypeBean3=new RecoveryTypeBean();
        recoveryTypeBean3.setDustbinBoxId("133");
        recoveryTypeBean3.setDustbinId(53);
        recoveryTypeBean3.setCategoryId("3");
        recoveryTypeBean3.setCategoryName("织物类");
        recoveryTypeBean3.setDeliveryPrice(0.5);
        recoveryTypeBean3.setSort(3);
        recoveryTypeBean3.setIcon("textile.png");
        recoveryTypeBean3.setIconFullName("http://192.168.2.48:3333/images/icon/category/textile.png");
        recoveryTypeBean3.setLoading(0);
        recoveryTypeBean3.setStatus("empty");
        RecoveryTypeBean recoveryTypeBean4=new RecoveryTypeBean();
        recoveryTypeBean4.setDustbinBoxId("133");
        recoveryTypeBean4.setDustbinId(53);
        recoveryTypeBean4.setCategoryId("3");
        recoveryTypeBean4.setCategoryName("织物类");
        recoveryTypeBean4.setDeliveryPrice(0.5);
        recoveryTypeBean4.setSort(4);
        recoveryTypeBean4.setIcon("textile.png");
        recoveryTypeBean4.setIconFullName("http://192.168.2.48:3333/images/icon/category/textile.png");
        recoveryTypeBean4.setLoading(0);
        recoveryTypeBean4.setStatus("empty");
        RecoveryTypeBean recoveryTypeBean5=new RecoveryTypeBean();
        recoveryTypeBean5.setDustbinBoxId("133");
        recoveryTypeBean5.setDustbinId(53);
        recoveryTypeBean5.setCategoryId("3");
        recoveryTypeBean5.setCategoryName("织物类");
        recoveryTypeBean5.setDeliveryPrice(0.5);
        recoveryTypeBean5.setSort(5);
        recoveryTypeBean5.setIcon("textile.png");
        recoveryTypeBean5.setIconFullName("http://192.168.2.48:3333/images/icon/category/textile.png");
        recoveryTypeBean5.setLoading(0);
        recoveryTypeBean5.setStatus("empty");
        RecoveryTypeBean recoveryTypeBean6=new RecoveryTypeBean();
        recoveryTypeBean6.setDustbinBoxId("133");
        recoveryTypeBean6.setDustbinId(53);
        recoveryTypeBean6.setCategoryId("3");
        recoveryTypeBean6.setCategoryName("织物类");
        recoveryTypeBean6.setDeliveryPrice(0.5);
        recoveryTypeBean6.setSort(6);
        recoveryTypeBean6.setIcon("textile.png");
        recoveryTypeBean6.setIconFullName("http://192.168.2.48:3333/images/icon/category/textile.png");
        recoveryTypeBean6.setLoading(0);
        recoveryTypeBean6.setStatus("empty");
        recoveryTypeBeanList.add(recoveryTypeBean1);
        recoveryTypeBeanList.add(recoveryTypeBean2);
        recoveryTypeBeanList.add(recoveryTypeBean3);
        recoveryTypeBeanList.add(recoveryTypeBean4);
        recoveryTypeBeanList.add(recoveryTypeBean5);
        recoveryTypeBeanList.add(recoveryTypeBean6);

        return recoveryTypeBeanList;
    }
}
