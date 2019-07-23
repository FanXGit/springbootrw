package com.fzx.study.springbootrw.service;



import com.fzx.study.springbootrw.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/22  10:05
 **/

public interface UserService {
    public int insert(User member);

    public int save(User member);
    public List<User> selectAll();

    public String getToken(String appId);
}
