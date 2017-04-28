package com.ByName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ManageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Resource res = new ClassPathResource("applicationContext.xml");
	       BeanFactory factory = new XmlBeanFactory(res);
	        
	       Object o = factory.getBean("department");
	       Department dep = (Department)o;
	        
	        dep.show();
	}
	
 	/*<bean id="department" class="com.ByName.Department" autowire="byName">
	<bean id="department" class="com.ByName.Department" autowire="byType"> 
	<bean id="department" class="com.ByName.Department" autowire="constructor">*/ 
}
