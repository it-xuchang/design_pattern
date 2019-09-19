package com.xuchang.patterns.creational.singleton;

import org.springframework.util.StringUtils;

import java.util.HashMap;


public class ContainerSingleton {

    private static HashMap<String,Object> map = new HashMap<String, Object>();

    private ContainerSingleton(){}

    public static void putInstace(String key,Object object){
        if(!StringUtils.isEmpty(key) && object !=null){
            map.put(key,object);
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}
