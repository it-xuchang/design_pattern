package com.xuchang.patterns.creational.abstractfactory;



/**
 * 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 * 定义：抽象工厂模式提供一个创建一系列相关或互相依赖对象的接口，无须指定它们具体的类
 * 类型：创建型
 * 适用场景：
 *  客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 *  强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码
 *  提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现
 *
 * 优点：
 * 具体产品在应用层代码隔离，无须关心创建细节
 * 将一个系列的产品族统一到一起创建
 *
 * 缺点：
 * 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 * 增加了系统的抽象性和理解难度
 */
public class Test {
   public static void main(String[] args) {

      System.out.println("===================小米系列产品=================");
      //小米产品工厂实例
      IProductFactory xiaomiProductFactory = new XiaomiProductFactory();
      //生产小米路由器
      IRouterProduct xiaomiRouter = xiaomiProductFactory.produceRouter();
      xiaomiRouter.start();
      xiaomiRouter.setting();
      xiaomiRouter.openWifi();
      xiaomiRouter.shutdown();
      //生产小米手机
      IPhoneProduct xiaomiPhone = xiaomiProductFactory.produceTelPhone();
      xiaomiPhone.start();
      xiaomiPhone.callUp();
      xiaomiPhone.sendSMS();
      xiaomiPhone.shutdown();

      System.out.println("===================华为系列产品=================");
      //华为产品工厂实例
      IProductFactory huaweiProductFactory = new HuaweiProductFactory();
      //生产华为路由器
      IRouterProduct huaweiRouter = huaweiProductFactory.produceRouter();
      huaweiRouter.start();
      huaweiRouter.setting();
      huaweiRouter.openWifi();
      huaweiRouter.shutdown();
      //生产华为手机
      IPhoneProduct huaweiPhone = huaweiProductFactory.produceTelPhone();
      huaweiPhone.start();
      huaweiPhone.callUp();
      huaweiPhone.sendSMS();
      huaweiPhone.shutdown();

 

   }
}