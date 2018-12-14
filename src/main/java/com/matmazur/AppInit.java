package com.matmazur;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit  extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.setServletContext(servletContext);
//
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
//        Dynamic dispatcherConfig = servletContext.addServlet("dispatcher", dispatcherServlet);
//        dispatcherConfig.addMapping("/");
//    }
}
