package com.dxx.bokeadmin.mapper;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * 自定义通用mapper
 * @param <T>
 */
@Component
public interface BaseMapper<T> {
    int insert(T t);
    int updateById(T t);
    int deleteById(Object o);
    T selectById(Object o);
    List<T> selectAll();

}
