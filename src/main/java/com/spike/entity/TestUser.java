package com.spike.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_user")
public class TestUser {
    @TableId(type = IdType.AUTO)
    String id;
    String name;
    Integer age;
}
