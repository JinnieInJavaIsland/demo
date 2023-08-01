package com.example.demo.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("Select now()")
    String getTime();
}
