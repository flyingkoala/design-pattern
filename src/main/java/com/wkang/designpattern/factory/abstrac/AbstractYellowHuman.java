package com.wkang.designpattern.factory.abstrac;

import com.wkang.designpattern.factory.abstrac.Human;

/**
 * 黄种人
 * @author wkang
 * @description:
 * @since 2022/3/2 19:19
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄的");
    }

    @Override
    public void talk() {
        System.out.println("很多黄种人说中文");
    }
}
