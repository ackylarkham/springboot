package com.example.sample.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.sample.domain.user.model.MUser;

@Mapper
public interface UserMapper {

    public int insertOne(MUser user);

    public List<MUser> findMany(MUser user);

    public MUser findOne(String userId);

    public void updateOne(@Param("userId") String userId,
                        @Param("password") String password,
                        @Param("userName") String userName);

    public int deleteOne(@Param("userId") String userId);
}
