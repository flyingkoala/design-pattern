package com.wkang.designpattern;

import com.wkang.designpattern.factory.simple.Product;
import com.wkang.designpattern.factory.simple.ProductA;
import com.wkang.designpattern.factory.simple.ProductFactory;
import com.wkang.designpattern.factory.standard.*;
import com.wkang.designpattern.prototype.Movie;
import com.wkang.designpattern.prototype.Thing;
import com.wkang.designpattern.single.LazySingleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void contextLoads() {

        //原型模式
        System.out.println("****【原型模式】****");
        Movie movie = new Movie();
        movie.setName("不能说的秘密");
        movie.setType("爱情");

        Movie movie2 = movie.clone();
        movie2.setName("海角七号");

        System.out.println(movie.getName()+"|"+movie.getType());
        System.out.println(movie2.getName()+"|"+movie2.getType());


        Thing thing = new Thing();
        thing.setArrayList(new ArrayList<String>(Arrays.asList("张三")));

        Thing thing2 = thing.clone();
        thing2.setArrayList(new ArrayList<>(Arrays.asList("李四")));

        System.out.println(thing.getArrayList());
        System.out.println(thing2.getArrayList());


        //单例模式
        System.out.println("****【单例模式】****");
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        if (singleton1==singleton2){
            System.out.println("懒汉单例相同");
        }else {
            System.out.println("懒汉单例不同");
        }


        LazySingleton singleton3 = LazySingleton.getInstance();
        LazySingleton singleton4 = LazySingleton.getInstance();
        if (singleton3==singleton4){
            System.out.println("饿汉单例相同");
        }else {
            System.out.println("饿汉单例不同");
        }

        //简单工厂
        System.out.println("****【简单工厂】****");
        Product a = ProductFactory.createProduct("A");
        a.getColor();
        a.getSize();

        Product b = ProductFactory.createProduct("B");
        b.getColor();
        b.getSize();

        //工厂方法
        System.out.println("****【简单工厂】****");
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human human= humanFactory.createHuamn(YellowHuman.class);
        human.getColor();
        human.talk();
        Human human2= humanFactory.createHuamn(BlackHuman.class);
        human2.getColor();
        human2.talk();


    }

}
