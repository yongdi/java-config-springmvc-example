package com.voyg.mvctest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <strong>this is for other bean, except spring</strong><br>
 *
 * @author voyg.net
 * @see <a href="https://voyg.net">https://voyg.net</a>
 * @since 16-11-3
 */
@Configuration
@ComponentScan(basePackages = "com.voyg.mvctest",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
