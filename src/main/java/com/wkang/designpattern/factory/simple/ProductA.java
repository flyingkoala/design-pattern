package com.wkang.designpattern.factory.simple;

/**
 * 产品实现类A
 * @author wkang
 * @description:
 * @since 2022/3/2 13:28
 */
public class ProductA  implements Product{
    @Override
    public void getColor() {
        System.out.println("产品A是蓝色");
    }

    @Override
    public void getSize() {
        System.out.println("产品A有5米");
    }
}
