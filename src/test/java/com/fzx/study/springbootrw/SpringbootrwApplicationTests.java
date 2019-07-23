package com.fzx.study.springbootrw;

import com.fzx.study.springbootrw.bean.User;
import com.fzx.study.springbootrw.common.CommonUtil;
import com.fzx.study.springbootrw.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.fzx.study.springbootrw.mapper")
public class SpringbootrwApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    public void contextLoads() {



        User user = new User();
        user.setId(CommonUtil.getUUID());
        user.setName("zhangsan");

        System.out.println(user.getId());
        userService.insert(user);

        List<User> users=userService.selectAll();
        for (User user1:users){
            System.out.println(user1);
        }

    }

    @Test
    public void Test(){
        List<User> users=userService.selectAll();
        for (User user:users){
            System.out.println(user);
        }
    }

}
