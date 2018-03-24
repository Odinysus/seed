package com.odinysus.seed.service.impl.auth.permission;

import com.odinysus.seed.entity.auth.permission.Perm;
import com.odinysus.seed.mapper.auth.permission.PermMapper;
import com.odinysus.seed.service.auth.permission.PermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省级平台权限 服务实现类
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
@Service
public class PermServiceImp extends ServiceImpl<PermMapper, Perm> implements PermService {

}
