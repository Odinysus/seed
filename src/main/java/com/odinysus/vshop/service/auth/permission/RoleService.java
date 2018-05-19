package com.odinysus.vshop.service.auth.permission;

import com.odinysus.vshop.entity.auth.permission.Role;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 省级平台角色 服务类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
public interface RoleService extends IService<Role> {
    List<Role> selectListByUserId(int userId);
}
