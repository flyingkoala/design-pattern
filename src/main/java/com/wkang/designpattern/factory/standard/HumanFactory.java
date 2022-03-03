package com.wkang.designpattern.factory.standard;

/**
 * @author wkang
 * @description:
 * @since 2022/3/3 10:44
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuamn(Class<T> c) {
        Human human=null;
        try {
            //生成一个人类
            human=(T)Class.forName(c.getName()).newInstance();

        }catch (Exception ex){
            System.out.println("人类生成异常");
        }

        return (T) human;
    }
}
