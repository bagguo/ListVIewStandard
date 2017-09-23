package com.example.bagguo.uicustomviews;

/**
 * Created by bagguo on 2017/9/23.
 */

public class Fruit {
    private String name;
    private int imageId;
//调用构造函数就以获取数据
    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
