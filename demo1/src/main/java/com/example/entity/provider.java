package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class provider {

    public Integer id;
    public String code;
    public String companyName;
    public String desc;
    public String name;
    public String phone;
    public String address;
    public String fax;
    public String date;



}
