package com.xuchang.patterns.behavioral.templatemethod.v2;


public class Test {

    public static void main(String[] args) {


        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        //采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {

            @Override
            public void transact() {
                System.out.println("我要存钱！");
            }
        };
        btm2.process();

        BankTemplateMethod btm3 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要理财！我这里有2000万韩币");
            }
        };

        btm3.process();



    }
}