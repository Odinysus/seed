package com.odinysus.vshop.service.impl.auth.permission;

import com.odinysus.vshop.entity.auth.permission.Perm;
import com.odinysus.vshop.mapper.auth.permission.PermMapper;
import com.odinysus.vshop.service.auth.permission.PermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 省级平台权限 服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
@Service
public class PermServiceImpl extends ServiceImpl<PermMapper, Perm> implements PermService {

    @Override
    public List<Perm> selectListByUserId(int userId) {
        return baseMapper.selectListByUserId(userId);
    }
}
