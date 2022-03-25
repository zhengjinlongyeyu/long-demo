package com.application.bussiness.test.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.bussiness.test.entity.UserEntity;
import com.application.bussiness.test.mapper.UserMapper;
import com.application.bussiness.test.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.util.QueryVO;
import com.util.Result;
import com.util.ResultUtil;

@RestController
@RequestMapping("/testBoot")
public class UserController {
	
	 @Autowired
	 private UserService userService;
	 
	 @Autowired
	 private UserMapper userMapper;
	 
	   @Autowired 
	   private RedisTemplate<String, Object> redisTemplate;
	 
	 @RequestMapping("getUser/{id}")
	 public String GetUser(@PathVariable int id){
	        return userService.getUserById(id).toString();
	    }
	 @RequestMapping("getList")
	 public Result<?>  selectPage(@RequestBody QueryVO<UserEntity> uservo){
		 

	       
	        IPage<UserEntity> userIPage = userService.selectPage(uservo);
	        System.out.println("总页数： "+userIPage.getPages());
	        System.out.println("总记录数： "+userIPage.getTotal());
	        userIPage.getRecords().forEach(System.out::println);
	        
	        return ResultUtil.successPage(userIPage);
	    }

	 @RequestMapping("getListPage")
	 public Result<?>  getListPage(@RequestBody QueryVO<UserEntity> uservo){
		 

	       
	        IPage<UserEntity> userIPage = userService.getListPage(uservo);
	        System.out.println("总页数： "+userIPage.getPages());
	        System.out.println("总记录数： "+userIPage.getTotal());
	        userIPage.getRecords().forEach(System.out::println);
	        
	        return ResultUtil.successPage(userIPage);
	    }
	 
	 @RequestMapping("getListall")
	 public Result<?>  getListall(@RequestBody UserEntity userEntity){
		 

		 List<UserEntity> listALL = userService.getListALL(userEntity);
		 listALL.forEach(m->{
			 System.out.println("++++++++>"+m);
		 });
		 
	        
	        return ResultUtil.success("asdfas", listALL);
	    }
	 
	 
	 @RequestMapping("getTest")
	 public Result<?>  getTest(String aaaaString ){
		 

		 System.out.println("++++++++>"+ aaaaString);		 
	        
	        return ResultUtil.success("asdfas", aaaaString);
	    }
	 

	


}
