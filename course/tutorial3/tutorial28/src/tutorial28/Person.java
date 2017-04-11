package tutorial28;

public class Person implements Info{
	private String name;
public Person(String name) {
		this.name = name;
	}
public void greet(){
	System.out.println("hello there: " + name);
}
@Override
public void showInfo() {
	// TODO Auto-generated method stub
	System.out.println(name);
}

}
