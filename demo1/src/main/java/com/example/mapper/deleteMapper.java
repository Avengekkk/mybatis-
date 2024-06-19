package com.example.mapper;

import org.apache.ibatis.annotations.Param;

public interface deleteMapper {
        public int deleteByID(@Param("id") int id);

        //删除在北京的公司
        public int deleteCollection(@Param("arr") String[] arr);



}
