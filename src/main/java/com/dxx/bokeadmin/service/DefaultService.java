package com.dxx.bokeadmin.service;

import java.util.List;

/**c
 * 自定义通用service
 * @param <T>
 */
public interface DefaultService<T> {
    int insert(T t);
    int updateById(T t);
    int deleteById(Object o);
    T selectById(Object o);
    List<T> selectAll();
}
