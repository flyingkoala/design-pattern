package com.wkang.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * Thing原型类
 * 深拷贝
 * @author wkang
 * @description:
 * @since 2022/3/2 13:50
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    //重写克隆方法
    @Override
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            //完成对引用类型数据的深度拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();

        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return thing;
    }
}
