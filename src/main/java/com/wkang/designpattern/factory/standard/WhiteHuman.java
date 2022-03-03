package com.wkang.designpattern.factory.standard;

/**
 * 白种人
 * @author wkang
 * @description:
 * @since 2022/3/2 19:19
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白种人很白");
    }

    @Override
    public void talk() {
        System.out.println("很多黄种人说英文");
    }
}
