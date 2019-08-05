package com.mycompany.thewineproject.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{AppConfig.class};
//        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[] {AppConfig.class};
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
