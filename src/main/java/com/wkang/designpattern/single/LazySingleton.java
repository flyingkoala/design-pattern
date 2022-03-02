package com.wkang.designpattern.single;

/**
 * 懒汉式单例
 * @author wkang
 * @description:
 * @since 2022/2/21 16:44
 */
public class LazySingleton {

    /**保证 instance 在所有线程中同步 */
    private static volatile LazySingleton instance = null;

    /**private 避免类在外部被实例化 */
    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}
