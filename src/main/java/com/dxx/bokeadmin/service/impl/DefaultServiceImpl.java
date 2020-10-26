package com.dxx.bokeadmin.service.impl;

import com.dxx.bokeadmin.mapper.BaseMapper;
import com.dxx.bokeadmin.service.DefaultService;
import com.dxx.bokeadmin.tools.ErrorCode;
import com.dxx.bokeadmin.tools.MyException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * 自定义通用serviceImpl
 * @param <T>
 */
public abstract class DefaultServiceImpl<M extends BaseMapper<T>,T> implements DefaultService<T> {

    private M baseMapper;

    @Autowired(required = false)
    public void setBaseMapper(M baseMapper){
        this.baseMapper = baseMapper;
    }

    @Override
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int updateById(T t) {
        return baseMapper.updateById(t);
    }

    @Override
    public int deleteById(Object o) {
        return baseMapper.deleteById(o);
    }

    @Override
    public T selectById(Object o) {
        T t = baseMapper.selectById(o);
        if(t == null){
            throw new MyException(ErrorCode.NO_DATA);
        }
        return t;
    }

    @Override
    public List<T> selectAll() {
        List<T> list = baseMapper.selectAll();
        if(list.size() == 0){
            throw new MyException(ErrorCode.NO_DATA);
        }
        return list;
    }
}
