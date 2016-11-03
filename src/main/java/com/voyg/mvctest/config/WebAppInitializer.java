package com.voyg.mvctest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * <strong>replace web.xml</strong><br>
 *
 * @author voyg.net
 * @see <a href="https://voyg.net">https://voyg.net</a>
 * @since 16-11-3
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class}; //context for root, like dao, middleware
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class}; //context for spring, like controller, view resolver
    }

    protected String[] getServletMappings() {
        return new String[]{"/"}; //DispatcherServer map to /
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new MyFilter()};
    }
}
