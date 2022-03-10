package com.wkang.designpattern.factory.abstrac;

import com.wkang.designpattern.factory.abstrac.Human;

/**
 * 黑人
 * @author wkang
 * @description:
 * @since 2022/3/2 19:19
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑的");
    }

    @Override
    public void talk() {
        System.out.println("黑人的语言听不懂");
    }
}
