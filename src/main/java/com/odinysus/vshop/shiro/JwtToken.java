package com.odinysus.vshop.shiro;

import org.apache.shiro.authc.AuthenticationToken;

import java.util.Map;

/**
 * HMAC令牌
 * @author wangjie (http://www.jianshu.com/u/ffa3cba4c604) 
 * @date 2016年6月24日 下午2:55:15
 */
public class JwtToken implements AuthenticationToken {
    private static final long serialVersionUID = -790191688300000066L;

    /**
     * json web token
     */
    private String jwt;
    /**
     * 客户端IP
     */
    private String host;

    public JwtToken(String jwt,String host){
        this.jwt = jwt;
        this.host = host;
    }

    public JwtToken(String jwt){
        this.jwt = jwt;
        this.host = null;
    }

    @Override
    public Object getPrincipal() {
        return this.jwt;
    }

    @Override
    public Object getCredentials() {
        return this.jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
