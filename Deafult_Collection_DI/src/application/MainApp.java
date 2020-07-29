package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class MainApp {
   public static void main(String[] args) {
	   
	 //For single xml file
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml"); 
 	   Test c =  (Test) applicationContext.getBean("t");
	   c.print();
	     
   }
}