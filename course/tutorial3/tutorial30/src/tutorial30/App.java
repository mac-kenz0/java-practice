package tutorial30;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		Plant plant2 = tree1;
		// what matters is not the variable declaration
		// but the guts of the object or instanciation of class
		plant2.grow();
		//tree.shedLeaves();
		
		// can't call shedLeaves 
		// it's a plant not tree
		// the variable type (declaration) decides what methods to call
		// but when you actually call that method, it's the instanciation
		// that determines which method is called
		//plant2.shedLeaves();
	}
	/* one common situation where you want to do this
	 * */
public static void doGrow(Plant plant){
	plant.grow();
}
}
