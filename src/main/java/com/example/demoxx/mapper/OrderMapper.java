package com.example.demoxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demoxx.entity.Order;
import com.example.demoxx.entity.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from `order` where uid = #{uid}")
    List<Order> selectByUid(String uid);

    @Select("select * from order")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "ordertime", property = "ordertime"),
            @Result(column = "total", property = "total"),
            @Result(column = "uid", property = "user", javaType = User.class,
                    one = @One(select = "om.example.demoxx.mapper.UserMapper.selectById"))
    })
    List<Order> selectAllOrdersAndUser();
}
