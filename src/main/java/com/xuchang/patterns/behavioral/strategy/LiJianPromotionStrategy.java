package com.xuchang.patterns.behavioral.strategy;


public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
