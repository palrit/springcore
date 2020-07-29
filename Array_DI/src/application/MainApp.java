package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class MainApp {
   public static void main(String[] args) {
	   
	 //For single xml file
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/car-engine.xml"); 
 	   Car c =  (Car) applicationContext.getBean("car");
	   c.print();
	     
   }
}