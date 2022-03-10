package com.wkang.designpattern.factory.abstrac;

/**
 * 黄色女性人种
 * @author wkang
 * @description:
 * @since 2022/3/10 16:49
 */
public class FemaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("我是女的啊");
    }
}
