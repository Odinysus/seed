package com.odinysus.vshop.service.impl.auth.permission;

import com.odinysus.vshop.entity.auth.permission.Role;
import com.odinysus.vshop.mapper.auth.permission.RoleMapper;
import com.odinysus.vshop.service.auth.permission.RoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 省级平台角色 服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Override
    public List<Role> selectListByUserId(int userId) {
        return baseMapper.selectListByUserId(userId);
    }
}
