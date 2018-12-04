package com.wangjipu.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wangjipu.entity.User;


@Service
public interface UserService {
	
	public User findByName(String name) throws Exception;
	
    //显示所有用户
    public List<User>getUser()throws Exception;
    //根据id删除用户
    public void deleteUser(int id)throws Exception;
    //新增用户
    public void addUser(User user)throws Exception;
}