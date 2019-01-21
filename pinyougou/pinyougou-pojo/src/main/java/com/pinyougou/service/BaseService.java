package com.pinyougou.service;

import com.pinyougou.vo.PageResult;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    public T findOne(Serializable id);

    public List<T> findAll();

    public List<T> findByWhere(T t);

    public PageResult findPage(Integer page, Integer rows);

    public PageResult findPage(Integer page,Integer rows, T t);

    public void add(T t);

    public void update(T t);

    public void deleteById(Serializable[] ids);

}
