package com.application.bussiness.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.application.bussiness.test.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface UserMapper  extends BaseMapper<UserEntity>{
	
	UserEntity getUserById(int id);
	
	
	IPage<UserEntity> getallListPage(Page<UserEntity> userPage,UserEntity userEntity);
	
	
	List<UserEntity> getListALL(UserEntity userEntity);

}
