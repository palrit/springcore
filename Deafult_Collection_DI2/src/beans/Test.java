package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	private List fruits;
	private Set drivers;
	private Map<String, String> cc;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setDrivers(Set drivers) {
		this.drivers = drivers;
	}
	public void setCc(Map<String, String> cc) {
		this.cc = cc;
	}
	
	public void print() {
		 System.out.println("Printing Fruits");
		  for (Object fruit : fruits) {
			System.out.println(fruit);
		}
		  System.out.println("Printing drivers");
		  for (Object driver : drivers) {
			System.out.println(driver);
		}
		  System.out.println("Printing country capitals");
		  Set keys = cc.keySet();
		  for (Object key : keys) {
			System.out.println("country "+key+ " capital "+cc.get(key));
		}
		  
	} 
	
	
	

}
