package com.fzx.study.springbootrw.ServiceImpl;

import com.fzx.study.springbootrw.bean.User;
import com.fzx.study.springbootrw.mapper.UserMapper;
import com.fzx.study.springbootrw.service.UserService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Fzx
 * @Description:
 * @Date :2019/7/22  10:08
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int insert(User member) {
        return userMapper.insert(member);
    }

    @Override
    public int save(User member) {
        return userMapper.save(member);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public String getToken(String appId) {
        return null;
    }
}
