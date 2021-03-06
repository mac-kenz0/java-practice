package tutorial31;
/*
 * Encapsulation Tutorial
 * Encapsulate the inner workings of a class so that
 * others outside the class cannot access inner workings
 * of the class
 * Make everything private that you can make private
 * Only expose class variables if final and constant
 */

class Plant {
	/* if you expose an variable,
	 * then usually it's just a constant */
	public final static int ID = 8;
	private String name;
	
	public String getData() {
		String data = "some stuff" + calculateGrowthForecase();
		return data;
	}

	private int calculateGrowthForecase() {
		return 9;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

}
