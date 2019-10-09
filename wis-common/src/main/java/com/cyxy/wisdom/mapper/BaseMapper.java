package com.cyxy.wisdom.mapper;

/**
 * @名称: BaseMapper
 * @描述:
 * @作者: 陈炳泰
 * @创建时间: 2019-10-09 15:57
 * @修改人:
 * @修改备注:
 * @修改时间:
 */
public interface BaseMapper<T>  {

    int insert(T t);

    int update(T t);

    T selectById(Integer id);


}
