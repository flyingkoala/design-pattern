package com.wkang.designpattern.factory.abstrac;

/**
 * @author wkang
 * @description:
 * @since 2022/3/10 17:08
 */
public class MaleFactory implements HumanFactory{
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
        return new MaleYellowHuman();
    }
}
