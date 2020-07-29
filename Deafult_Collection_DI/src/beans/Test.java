package beans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
	private Vector fruits;
	private TreeSet drivers;
	private Hashtable cc;
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public void setDrivers(TreeSet drivers) {
		this.drivers = drivers;
	}

	public void setCc(Hashtable cc) {
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
