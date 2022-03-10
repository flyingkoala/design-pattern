package com.wkang.designpattern.factory.abstrac;

/**
 * @author wkang
 * @description:
 * @since 2022/3/10 16:55
 */
public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("我是男的啊");
    }
}
