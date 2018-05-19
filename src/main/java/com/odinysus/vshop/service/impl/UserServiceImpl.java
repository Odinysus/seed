package com.odinysus.vshop.service.impl;

import com.odinysus.vshop.entity.User;
import com.odinysus.vshop.mapper.UserMapper;
import com.odinysus.vshop.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
