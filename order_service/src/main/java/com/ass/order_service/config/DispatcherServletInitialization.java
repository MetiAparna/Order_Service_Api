package com.ass.order_service.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class DispatcherServletInitialization implements WebApplicationInitializer{

	@SuppressWarnings("resource")
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
       AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
       ctx.register(OrderConfiguration.class);
       
       DispatcherServlet servlet = new DispatcherServlet(ctx);
       Dynamic dynamic = servletContext.addServlet("Dispatcher", servlet);
       dynamic.addMapping("/");
       dynamic.setLoadOnStartup(1);
        
	}

}
