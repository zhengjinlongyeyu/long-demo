package com.application.bussiness.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.bussiness.test.entity.UserEntity;
import com.application.bussiness.test.mapper.UserMapper;
import com.application.bussiness.test.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.util.QueryVO;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserEntity getUserById(int id) {
		
		return userMapper.getUserById(id);
	}

	@Override
	public IPage<UserEntity> selectPage(QueryVO<UserEntity> uservo) {
		 	LambdaQueryWrapper<UserEntity> userLambdaQueryWrapper = Wrappers.lambdaQuery();
		 	UserEntity entity = (UserEntity) uservo.getObject();
		 	if(entity !=null ) {
		 		  if(entity.getId() !=null && !"".equals(entity.getId())) {
		 			 userLambdaQueryWrapper.like(UserEntity::getId , entity.getId());  
		 		  }
		 		  if(entity.getRealName() !=null && !"".equals(entity.getRealName())) {
		 			 userLambdaQueryWrapper.like(UserEntity::getRealName , entity.getRealName());	 
		 		  }
		 	}
	        Page<UserEntity> userPage = new Page<>(uservo.getCurrentPage() , uservo.getShowCount());
		
		return userMapper.selectPage(userPage , userLambdaQueryWrapper);
	}

	@Override
	public IPage<UserEntity> getListPage(QueryVO<UserEntity> uservo) {
		UserEntity entity = (UserEntity) uservo.getObject();
		Page<UserEntity> userPage = new Page<>(uservo.getCurrentPage() , uservo.getShowCount());
		return userMapper.getallListPage(userPage, entity);
	}

	@Override
	public List<UserEntity> getListALL(UserEntity userEntity) {
	
			return userMapper.getListALL(userEntity);
		
		
		
	}
	
	

}
