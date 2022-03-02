package com.wkang.designpattern.factory.simple;


/**
 * 简单工厂工厂类
 * @author wkang
 * @description:
 * @since 2022/3/2 13:30
 */
public class ProductFactory {
    //静态方法
    public static Product createProduct(String p){
        Product instance = null;
        if (p=="A"){
            instance = new ProductA();
        }
        if (p=="B"){
            instance = new ProductB();
        }
        return  instance;
    }
}
