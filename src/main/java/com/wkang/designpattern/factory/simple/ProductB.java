package com.wkang.designpattern.factory.simple;

/**
 * 产品实现类B
 * @author wkang
 * @description:
 * @since 2022/3/2 13:28
 */
public class ProductB implements Product{
    @Override
    public void getColor() {
        System.out.println("产品B是红色");
    }

    @Override
    public void getSize() {
        System.out.println("产品B有55米");
    }
}
