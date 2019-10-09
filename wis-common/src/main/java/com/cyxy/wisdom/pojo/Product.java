package com.cyxy.wisdom.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @名称: Product
 * @描述:
 * @作者: 陈炳泰
 * @创建时间: 2019-10-09 13:29
 * @修改人:
 * @修改备注:
 * @修改时间:
 */
@Data
public class Product implements Serializable {

    //创新产品名称
    private String name;
    //创新产品描述
    private String desc;
    //创新产品图片  多个图片用,隔开
    private String images;

}

