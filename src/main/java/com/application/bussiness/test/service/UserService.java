package com.application.bussiness.test.service;

import java.util.List;

import com.application.bussiness.test.entity.UserEntity;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.util.QueryVO;

public interface UserService {
	
	UserEntity getUserById(int id);
	
	IPage<UserEntity>  selectPage(QueryVO<UserEntity> uservo);
	
	IPage<UserEntity>  getListPage(QueryVO<UserEntity> uservo);
	
	List<UserEntity>  getListALL(UserEntity userEntity);

}
