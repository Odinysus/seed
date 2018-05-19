package com.odinysus.vshop.shiro.filter;

import com.odinysus.vshop.shiro.JwtToken;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 基于HMAC（ 散列消息认证码）的无状态认证过滤器
 * @author wangjie (http://www.jianshu.com/u/ffa3cba4c604)
 * @date 2016年6月24日 下午2:55:15
 */
public class JwtFilter extends UserFilter {

    private static final Logger logger = LoggerFactory.getLogger(JwtFilter.class);


    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        if(logger.isErrorEnabled()) {
            logger.error("account need login for: {}",  ((HttpServletRequest)request).getServletPath());
        }
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        String authorization = httpServletRequest.getHeader("Authorization");
        if (authorization != null && !"".equals(authorization)) {
            JwtToken token = new JwtToken(authorization);
//            try {
                getSubject(request, response).login(token);
//            } catch (Exception e) {
//                errorMessage(httpServletResponse, e);
//                throw  new Shir
//                return false;
//            }

            return true;
        } else {
//            errorMessage(httpServletResponse, new Exception("当前用户未登录!"));
            return false;
        }
    }

//    private void errorMessage(HttpServletResponse httpServletResponse, Exception e) {
//
//        httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
//        // 请求被拦截后直接返回json格式的响应数据
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("message", e.getMessage());
//            httpServletResponse.getWriter().write(String.valueOf(jsonObject));
//
//        } catch (JSONException | IOException e1) {
//            e1.printStackTrace();
//        }
//
//    }
}
