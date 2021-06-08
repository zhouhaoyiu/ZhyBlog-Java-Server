package com.zhy.blog.service.impl;

import com.zhy.blog.pojo.Blog;
import com.zhy.blog.mapper.BlogMapper;
import com.zhy.blog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
