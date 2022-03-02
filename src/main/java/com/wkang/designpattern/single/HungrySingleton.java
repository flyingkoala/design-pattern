package com.wkang.designpattern.single;

/**
 * 饿汉式单例
 * @author wkang
 * @description:
 * @since 2022/2/21 17:01
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}