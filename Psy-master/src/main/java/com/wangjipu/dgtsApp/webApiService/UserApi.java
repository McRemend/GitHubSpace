package com.wangjipu.dgtsApp.webApiService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wangjipu.entity.User;
import com.wangjipu.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("api")
@Api(value="接口",tags= {"用户登录接口"})
public class UserApi {

    @Autowired
    private UserService userService;
    @Autowired
    private User user;
    //显示用户
    @ApiOperation(value="查询用户信息", notes = "查询数据库中的用户信息")
    @PostMapping("list")
    public List<User> index() throws Exception {
        return userService.getUser();
    }
    
    //登录验证
    @RequestMapping("login")
    public List<User> login() throws Exception {
    	
        return userService.getUser();
    }
    
    //删除用户
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id) throws Exception {
        userService.deleteUser(id);
        return "你已经删掉了id为"+id+"的用户";
    }
    //增加用户
    @RequestMapping("addUser")
    public String addUser() throws Exception {
        user.setAge(33);
        user.setUsername("阿花");
        user.setPassword("123456");
        userService.addUser(user);
        return "增加用户";
    }
}