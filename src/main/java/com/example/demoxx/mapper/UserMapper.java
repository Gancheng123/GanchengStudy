package com.example.demoxx.mapper;

import com.example.demoxx.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * From testtable")
    public List<User> find();
}
