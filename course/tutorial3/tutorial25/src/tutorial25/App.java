package tutorial25;

class Frog {
	private int id;
	private String name;
	
	public Frog (int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return String.format("%-4d: %s", id, name);
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object obj = new Object();
//		
		Frog frog1 = new Frog(14, "Quan");
		System.out.println(frog1);
		
	}

}
