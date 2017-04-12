package tutorial29;

import World.Plant;

public class Grass extends Plant{
	public Grass(){
		// won't work ... grass not in same package as plant,
		// even though it's a subclass
		//System.out.println(this.height);
	}
}
