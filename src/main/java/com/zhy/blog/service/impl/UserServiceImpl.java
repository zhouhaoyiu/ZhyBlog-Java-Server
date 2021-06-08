package com.zhy.blog.service.impl;

import com.zhy.blog.pojo.User;
import com.zhy.blog.mapper.UserMapper;
import com.zhy.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MysticZhou
 * @since 2021-06-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
