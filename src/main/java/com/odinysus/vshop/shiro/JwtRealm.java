package com.odinysus.vshop.shiro;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.RSAKeyProvider;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.odinysus.vshop.entity.User;
import com.odinysus.vshop.entity.auth.permission.Perm;
import com.odinysus.vshop.entity.auth.permission.Role;
import com.odinysus.vshop.service.UserService;
import com.odinysus.vshop.service.auth.permission.PermService;
import com.odinysus.vshop.service.auth.permission.RoleService;
import com.odinysus.vshop.shiro.util.JwtUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.bind.DatatypeConverter;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.*;

/**
 * 基于HMAC（ 散列消息认证码）的控制域
 * @author wangjie (http://www.jianshu.com/u/ffa3cba4c604)
 * @date 2016年6月24日 下午2:55:15
 */

@Component
public class JwtRealm extends AuthorizingRealm {

	@Autowired
	UserService userService;

	@Autowired
	RoleService roleService;

	@Autowired
    PermService permService;

	@Override
	public Class<?> getAuthenticationTokenClass() {
		//此Realm只支持JwtToken
		return JwtToken.class;
	}

	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth)
			throws AuthenticationException {
		String token = (String) auth.getCredentials();
		// 解密获得username，用于和数据库进行对比
		String username = JwtUtil.getUsername(token);
		if (username == null) {
			throw new AuthenticationException("token invalid");
		}

		User user = userService.selectOne(new EntityWrapper<User>().eq("username", username));
		if (user == null) {
			throw new AuthenticationException("User didn't existed!");
		}

		if (! JwtUtil.verify(token, username, user.getPassword())) {
			throw new AuthenticationException("Username or password error");
		}

		return new SimpleAuthenticationInfo(token, token, getName());

	}

	/**
	 * 授权,JWT已包含访问主张只需要解析其中的主张定义就行了
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = JwtUtil.getUsername(principals.toString());
		User user = userService.selectOne(new EntityWrapper<User>().eq("username", username));
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

		List<String> roleIds = new ArrayList<>();
		List<Role> roles = roleService.selectListByUserId(user.getId());
		for (Role role : roles) {
			roleIds.add(String.valueOf(role.getId()));
		}
		simpleAuthorizationInfo.addRoles(roleIds);
        List<Perm> perms = permService.selectListByUserId(user.getId());
        List<String> permKeys = new ArrayList<>();
        for (Perm perm : perms) {
            permKeys.add(perm.getKey());
        }
		simpleAuthorizationInfo.addStringPermissions(permKeys);
		return simpleAuthorizationInfo;
	}

}
