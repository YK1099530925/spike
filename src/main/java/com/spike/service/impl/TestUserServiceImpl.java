package com.spike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spike.entity.TestUser;
import com.spike.mapper.TestUserMapper;
import com.spike.service.ITestUserService;
import org.springframework.stereotype.Service;

@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements ITestUserService {
}
