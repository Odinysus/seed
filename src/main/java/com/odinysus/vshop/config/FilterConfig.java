package com.odinysus.vshop.config;

import com.odinysus.vshop.base.exception.ExceptionHandler;
import com.odinysus.vshop.base.filter.ExceptionHandlerFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author odinysus
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean exceptionHandlerFilter() {
        ExceptionHandlerFilter handlerFilter = new ExceptionHandlerFilter();
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(handlerFilter);
        registration.addUrlPatterns("/*");
        registration.setName("exceptionHandlerFilter");
        registration.setOrder(1);
        return registration;
    }
}
