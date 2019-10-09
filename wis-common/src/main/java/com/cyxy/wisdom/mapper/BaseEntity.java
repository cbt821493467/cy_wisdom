package com.cyxy.wisdom.mapper;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @名称: BaseEntity
 * @描述:
 * @作者: 陈炳泰
 * @创建时间: 2019-10-09 16:02
 * @修改人:
 * @修改备注:
 * @修改时间:
 */
@Data
public class BaseEntity implements Serializable {

    //主键id
    private Integer id;

    //逻辑删除
    private boolean deleted;

    //创建时间 //乐观锁
    private Date createTime;

    //更新时间
    private Date updateTime;


    private int version;
}

