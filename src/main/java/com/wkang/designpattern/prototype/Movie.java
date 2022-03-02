package com.wkang.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Movie原型类
 * 浅拷贝
 * @author wkang
 * @description:
 * @since 2022/3/2 13:50
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Cloneable {
    /**名称*/
    private String name;
    /**类型*/
    private String type;

    //重写克隆方法
    @Override
    public Movie clone(){
        Movie movie = null;
        try {
            movie = (Movie)super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return movie;
    }

}
