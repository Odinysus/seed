package com.odinysus.vshop.base.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * manager and handle exception of filter
 * @author odinysus
 */
public class ExceptionHandlerFilter extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            // custom error response class used across my project
            JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("message", e.getLocalizedMessage());
                response.setStatus(HttpStatus.UNAUTHORIZED.value());
            } catch (JSONException e1) {
                e1.printStackTrace();
            }

            response.getWriter().write(jsonObject.toString());
        }
    }

}
