package com.example.demoxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demoxx.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    //    @Select("select * From testtable")
//    public List<User> find();
//
//    @Insert("insert into testtable values(#{ID},#{name})")
//    public int insert(User user);
    @Select("Select * from User")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(column = "userage", property = "userage"),
            @Result(column = "birth", property = "birth"),
            @Result(column = "id", property = "orders", javaType = List.class,
                    many = @Many(select = "com.example.demoxx.mapper.OrderMapper.selectByUid")
            )
    })
    List<User> selectAllUserAndOrders();
}
