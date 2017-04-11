package tutorial21;
class Frog {
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog();
		
		frog.setName("yolo");
		frog.setAge(26);
		System.out.println(frog.getName());
	}

}