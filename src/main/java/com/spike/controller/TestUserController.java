package com.spike.controller;

import com.spike.entity.TestUser;
import com.spike.service.ITestUserService;
import com.spike.utils.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testUser")
public class TestUserController {
    @Autowired
    ITestUserService testUserService;
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/getUser")
    public Result getUser(){
        TestUser testUser = testUserService.getById(1);
        testUser.setId(null);
        testUserService.save(testUser);
        redisTemplate.opsForValue().set("yy:yy:" + testUser.getId(), testUser.getName());
        return Result.ok(testUser);
    }
}
