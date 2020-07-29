package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class MainApp {
   public static void main(String[] args) {
	   
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml"); 
	   Car c =  (Car) applicationContext.getBean("car");
	   c.printCarDetails();
	     
	   
   }
}