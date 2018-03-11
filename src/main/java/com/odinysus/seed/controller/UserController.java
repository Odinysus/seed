package com.odinysus.seed.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.odinysus.seed.entity.User;
import com.odinysus.seed.service.UserService;
import org.apache.ibatis.javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> userList() {
        return userService.selectList(new EntityWrapper<>());
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") String id) throws ObjectNotFoundException {
        User user = userService.selectById(id);
        if (user == null)
            throw new ObjectNotFoundException("错误,当前不对象不存在");
        return user;
    }
}
