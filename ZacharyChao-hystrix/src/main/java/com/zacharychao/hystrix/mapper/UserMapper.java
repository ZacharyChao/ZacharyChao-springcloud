package com.zacharychao.hystrix.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zacharychao.hystrix.entity.User;

@Mapper
public interface UserMapper {
	@Select("select * from user where id = #{id}")
	public User findById(@Param("id")String id);
}
