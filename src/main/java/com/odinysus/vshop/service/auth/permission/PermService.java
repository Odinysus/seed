package com.odinysus.vshop.service.auth.permission;

import com.odinysus.vshop.entity.auth.permission.Perm;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 省级平台权限 服务类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
public interface PermService extends IService<Perm> {

    List<Perm> selectListByUserId(int userId);
}
