package com.example.mapper;

import com.example.entity.provider;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface selectMapper {

    public ArrayList<provider> selectAll();
    public ArrayList<provider> selectByGoods(String name);

    public ArrayList<provider> selectByCondition(@Param("proDesc") String desc,@Param("proAddress") String address,@Param("creationDate") String date);


}
