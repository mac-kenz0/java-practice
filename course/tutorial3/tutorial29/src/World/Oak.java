package World;

public class Oak extends Plant{
	public Oak(){
		this.size = "large";
		// no access specifier
		// works because oak and plan in same package
		this.height = 10;
	}
	// can't do this , variable type is private to Plant class
	//type = tree;
	
}
