package com.wkang.designpattern.factory.abstrac;

/**
 * 人类
 * @author wkang
 * @description:
 * @since 2022/3/2 19:17
 */
public interface Human {
    //人种有颜色
    public void getColor();
    //人类会说话
    public void talk();
    //人类有性别
    public void getSex();
}
