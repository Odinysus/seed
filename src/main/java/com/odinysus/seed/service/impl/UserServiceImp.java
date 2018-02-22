package com.odinysus.seed.service.impl;

import com.odinysus.seed.entity.User;
import com.odinysus.seed.mapper.UserMapper;
import com.odinysus.seed.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2018-02-15
 */
@Service
public class UserServiceImp extends ServiceImpl<UserMapper, User> implements UserService {

}
