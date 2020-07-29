package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class MainApp {
   public static void main(String[] args) {
	   
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");   
	 Test t = (Test)  applicationContext.getBean("t"); 
	 t.printHello("Amrit");
	      
      
   }
}