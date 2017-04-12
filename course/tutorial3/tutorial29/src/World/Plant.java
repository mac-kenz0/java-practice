package World;

public class Plant {
	// bad practice
public String name;

// acceptable
public final static int ID = 8;
// private only access within this class
private String type ;

protected String size;

// no private public protected
// can access within the same class
// 
int height;
public Plant(){
	this.name = "freddy";
	this.type = "plant";
	this.size = "bug";
	this.height = 4;
}
}
