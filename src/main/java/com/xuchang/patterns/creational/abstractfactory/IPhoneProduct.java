package com.xuchang.patterns.creational.abstractfactory;

/**
 * 手机产品接口
 */
public interface IPhoneProduct {

    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 拨打电话
     */
    void callUp();

    /**
     * 发送短信
     */
    void sendSMS();

}
