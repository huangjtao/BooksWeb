package com.hjt.dao;

import com.hjt.pojo.Bookinfo;

import java.util.List;

public interface BookinfoDAO {

    public int save(Bookinfo b);//保存
    public int update(Bookinfo b);//修改
    public int delete(int id);//删除
    public List<Bookinfo> getAll();//查询所有
    public Bookinfo get(int id);//根据主键查询
    public List<Bookinfo> getPage(int pageNum,int pageSize);//分页查询


}
