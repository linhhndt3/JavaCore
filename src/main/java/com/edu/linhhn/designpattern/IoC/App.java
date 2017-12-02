package com.edu.linhhn.designpattern.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.edu.linhhn.designpattern.IoC.AppConfig;
import org.springframework.core.convert.support.PropertyTypeDescriptor;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NotifyExport notifyExport = (NotifyExport)context.getBean("viettel");
		notifyExport.notify("Doanh so ban hang nam 2017");
	}
}
