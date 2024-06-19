package com.example.mapper;

import org.apache.ibatis.annotations.Param;

public interface updateMapper {
    public int updateByName(@Param("name") String name,@Param("address") String address,
                            @Param("phone") String phone, @Param("human") String human);

    public int updateAll(@Param("old") String old,@Param("New") String New);
}
