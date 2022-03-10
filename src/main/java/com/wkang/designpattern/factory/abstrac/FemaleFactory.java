package com.wkang.designpattern.factory.abstrac;

/**
 * @author wkang
 * @description:
 * @since 2022/3/10 17:07
 */
public class FemaleFactory implements HumanFactory{
    @Override
    public Human createBlackHuman() {
        return null;
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
