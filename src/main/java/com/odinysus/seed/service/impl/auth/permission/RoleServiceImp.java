package com.odinysus.seed.service.impl.auth.permission;

import com.odinysus.seed.entity.auth.permission.Role;
import com.odinysus.seed.mapper.auth.permission.RoleMapper;
import com.odinysus.seed.service.auth.permission.RoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省级平台角色 服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
@Service
public class RoleServiceImp extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
