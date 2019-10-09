package com.cyxy.wisdom.utils;

import lombok.Builder;

import java.io.Serializable;

/**
 * @名称: Result
 * @描述:
 * @作者: 陈炳泰
 * @创建时间: 2019-10-09 14:49
 * @修改人:
 * @修改备注:
 * @修改时间:
 */
@Builder
public class Result<T> implements Serializable {

    private T data;

    private String msg;

    private int code;

    public Result(T data, String msg, int code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }




}

