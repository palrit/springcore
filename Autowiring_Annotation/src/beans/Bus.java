package beans;

public class Bus {
	
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/*
	 * public Bus() { System.out.println("Default Constructor"); }
	 */

	public Bus(Engine engine) {
		super();
		System.out.println("Parameterized constructor");
		this.engine = engine;
	}
	
	public void printData() {
		System.out.println("Bus model engine year" +engine.getModelYear());
	}

}
