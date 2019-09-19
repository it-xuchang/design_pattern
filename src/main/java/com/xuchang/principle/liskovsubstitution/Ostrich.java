package com.xuchang.principle.liskovsubstitution;

public class Ostrich extends Bird {

    @Override
    public void setSpeed(double speed) {
        flySpeed = 0;
    }
}
