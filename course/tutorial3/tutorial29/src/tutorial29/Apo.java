package tutorial29;

import World.Plant;

/*Private Public Protected Tutorial
 * 
 * Public -  from anywhere
 * Private - only from within the same class
 * Protected - subclass, and same package
 * no Modifer - same package only
 * */
public class Apo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// will not work. size is protected
		// app is not in the same package as plant
		//System.out.println(plant.size);
		
		
		// won't workk; app and plant are in different packages. 
		// height has package -level visability
		// system.out.println(plant.height);
	}

}
