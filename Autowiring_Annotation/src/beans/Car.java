package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	 private String carName;
	
	 public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Autowired
	 @Qualifier("engine1")
	 private Engine engine;
	 
	public void printCarDetails() {
		 System.out.println(" Car Name: "+carName);
		 System.out.println(" Model Year: "+engine.getModelYear());
	 }

}
