package com.example.sample.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.sample.domain.user.model.MUser;

@Mapper
public interface UserMapper {

    public int insertOne(MUser user);

    public List<MUser> findMany();

    public MUser findOne(String userId);

}
