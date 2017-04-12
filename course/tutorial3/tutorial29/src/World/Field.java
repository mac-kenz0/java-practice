package World;

public class Field {
	Plant plant = new Plant();
	public Field(){
		// size is protected. field is in the same package as Plant
		System.out.println(plant.size);
		//plant.size;
	}
}
