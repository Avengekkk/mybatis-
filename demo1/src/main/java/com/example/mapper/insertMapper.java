package com.example.mapper;

import com.example.entity.provider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Property;

public interface insertMapper {

    public boolean insertRow(@Param("proCode") String code, @Param("proAddress") String address,
                             @Param("proDesc") String desc, @Param("proFax") String fax,
                             @Param("creationDate") String date,@Param("proPhone") String phone,
                             @Param("proName") String companyName, @Param("proContact") String name,
                             @Param("createdBy") Integer createBy);

    public provider getLast();


}
