package com.wangjipu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wangjipu.entity.User;
import com.wangjipu.service.UserService;


@Controller
public class indexController {

    @Autowired
    private UserService userService;
    @Autowired
    private User user;
    
    @RequestMapping("/index")
    public String index() {
		return "index";
	}
    
}