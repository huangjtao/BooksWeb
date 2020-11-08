package com.hjt.dao;

import com.hjt.pojo.Userinfo;

import java.util.List;

//interface 接口 定义了规范 没有任何具体代码实现
public interface UserinfoDAO {

    public Userinfo getByName(String username);//根据用户名查询登录
    public int save(Userinfo a);//保存
    public int update(Userinfo a);//修改
    public int delete(int id);//删除
    public List<Userinfo> getAll(String keyword);//查询所有
    public Userinfo get(int id);//根据主键查询
    public int count();//统计
    public List<Userinfo> getPage(int pageNum,int pageSize);//分页查询

}
