package com.odinysus.seed.service.impl.auth.permission;

import com.odinysus.seed.entity.auth.permission.UserPerm;
import com.odinysus.seed.mapper.auth.permission.UserPermMapper;
import com.odinysus.seed.service.auth.permission.UserPermService;
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
public class UserPermServiceImp extends ServiceImpl<UserPermMapper, UserPerm> implements UserPermService {

}
