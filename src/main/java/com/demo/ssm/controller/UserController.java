package com.demo.ssm.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.ssm.pojo.User;
import com.demo.ssm.service.UserService;
/**
 * 定义控制层类
 * @author Administrator
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("findAll")
	public String findAll(Model model) {		
		List<User> list = userService.findAllUser();
		model.addAttribute("list", list);
		return "index";
	}
}