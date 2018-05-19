package com.odinysus.vshop.service.impl.auth.permission;

import com.odinysus.vshop.entity.auth.permission.UserRole;
import com.odinysus.vshop.mapper.auth.permission.UserRoleMapper;
import com.odinysus.vshop.service.auth.permission.UserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省级平台用户角色 服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
