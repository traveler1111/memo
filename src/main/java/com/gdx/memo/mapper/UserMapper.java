package com.gdx.memo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gdx.memo.entity.User;

@Mapper
public interface UserMapper {


List<User> findAllUser();
}
