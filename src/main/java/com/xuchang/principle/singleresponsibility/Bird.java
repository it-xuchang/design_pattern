package com.xuchang.principle.singleresponsibility;


public class Bird {
    public void move(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else if("大雁".equals(birdName)){
            System.out.println(birdName+"用翅膀飞");
        }// 燕子
    }
}
