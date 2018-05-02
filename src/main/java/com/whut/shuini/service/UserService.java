package com.whut.shuini.service;

import com.whut.shuini.dao.UsersMapper;
import com.whut.shuini.entity.Users;
import com.whut.shuini.entity.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UsersMapper usersMapper;

      //按照用户名 模糊查询
    public  List selectUserByName( String username){
        UsersExample usersExample =new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        //模糊查询 “%”
        criteria.andUsernameLike("%"+username+"%");
        List<Users> users=usersMapper.selectByExample(usersExample);
        return  users;
    }
}
