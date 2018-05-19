package com.odinysus.vshop.mapper.auth.permission;

import com.odinysus.vshop.entity.auth.permission.Role;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 省级平台角色 Mapper 接口
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> selectListByUserId(@Param("userId") int userId);
}
