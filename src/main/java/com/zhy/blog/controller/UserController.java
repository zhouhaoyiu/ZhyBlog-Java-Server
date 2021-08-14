package com.zhy.blog.controller;


import com.zhy.blog.common.lang.Result;
import com.zhy.blog.pojo.User;
import com.zhy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MysticZhou
 * @since 2021-06-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
//    @RequiresAuthentication
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @GetMapping("index")
    public Result index(){
        User user = userService.getById(1l);
        return Result.succ(user);
    }
    @PostMapping("/save")
    public  Result save(@Validated @RequestBody User user){
        return Result.succ(user);
    }
}
