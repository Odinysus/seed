package com.odinysus.seed.service.impl.auth.permission;

import com.odinysus.seed.entity.auth.permission.RolePerm;
import com.odinysus.seed.mapper.auth.permission.RolePermMapper;
import com.odinysus.seed.service.auth.permission.RolePermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省级平台角色权限 服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
@Service
public class RolePermServiceImp extends ServiceImpl<RolePermMapper, RolePerm> implements RolePermService {

}
