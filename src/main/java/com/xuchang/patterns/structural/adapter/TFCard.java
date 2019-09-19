package com.xuchang.patterns.structural.adapter;

public interface TFCard {
    String readTF();    
    int writeTF(String msg);
}