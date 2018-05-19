package com.odinysus.vshop.controller.auth.login;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.odinysus.vshop.entity.User;
import com.odinysus.vshop.service.UserService;
import com.odinysus.vshop.shiro.JwtToken;
import com.odinysus.vshop.shiro.util.JwtUtil;
import org.apache.ibatis.javassist.tools.rmi.ObjectNotFoundException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author odinysus
 */
@RestController
@RequestMapping("/logins")
public class LoginController {

    @Autowired
    UserService userService;

    private final Logger logger = LoggerFactory.getLogger(getClass());



    @RequestMapping(value = "", method = RequestMethod.POST)
    public User login(HttpServletResponse response, @RequestBody Map<String, String> param) {
        Subject subject = SecurityUtils.getSubject();
        JwtToken token = new JwtToken(JwtUtil.sign(param.get("username"), param.get("password")));
        subject.login(token);
        response.setHeader("Authorization", String.valueOf(subject.getPrincipal()));
        return userService.selectOne(new EntityWrapper<User>().eq("username", param.get("username")));
    }
}
