package com.xuchang.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.move("大雁");
        bird.move("鸵鸟");


        FlyBird flyBird = new FlyBird();
        flyBird.move("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.move("鸵鸟");

    }
}
