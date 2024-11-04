package com.example.sample.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.sample.domain.user.model.MUser;

@Mapper
public interface UserMapper {

    public int insertOne(MUser user);

}
