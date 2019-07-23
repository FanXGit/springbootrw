package com.fzx.study.springbootrw.mapper;



import com.fzx.study.springbootrw.bean.User;

import java.util.List;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/22  10:09
 **/
public interface UserMapper {

    public int insert(User member);

    public int save(User member);
    public List<User> selectAll();

 //   public String getToken(String appId);
}
