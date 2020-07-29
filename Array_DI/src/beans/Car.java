package beans;

public class Car {
	 private String[] carNames;
	 private Engine[] engines;
	 
	public Car() {
		System.out.println("Car Constructor");
	}
	 
	 public String[] getCarName() {
		return carNames;
	}

	public void setCarName(String[] carName) {
		this.carNames = carName;
	}

	public Engine[] getEngines() {
		return engines;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}

	public void print() {
		for (String carName : carNames) {
			System.out.println(carName);
		}
		
		for (Engine engine : engines) {
			System.out.println(engine.getModelYear());
		}
	}

}
