package com.odinysus.vshop.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.odinysus.vshop.entity.User;
import com.odinysus.vshop.service.UserService;
import org.apache.ibatis.javassist.tools.rmi.ObjectNotFoundException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "", method = RequestMethod.GET)
    @RequiresPermissions("user:list")
    public List<User> userList() {
        return userService.selectList(new EntityWrapper<>());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") String id) throws ObjectNotFoundException {
        User user = userService.selectById(id);
        if (user == null) {
            logger.info("当前%d不对象不存在", id);
            throw new ObjectNotFoundException("错误,当前不对象不存在");
        }
        return user;
    }
}
