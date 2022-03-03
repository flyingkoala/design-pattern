package com.wkang.designpattern.factory.standard;

/**
 * 抽象人类创造工厂
 * @author wkang
 * @description:
 * @since 2022/3/2 19:23
 */
public abstract class AbstractHumanFactory {
    //采用泛型
    //要求输入参数必须是class 且必须是Human的实现类
    public abstract <T extends Human> T createHuamn(Class<T> c);
}
