package tutorial23;
class Thing {
	public String name;
	public static String description;
	
	private static int count = 0;
	public int id;
	public Thing() {
		id = count;
		count++;
	}
	
	public static int getCount(){
		return count;
	}
	public void showName() {
		System.out.println(description + ": " + name);
		
	}
	public static void showInfo() {
		System.out.println(description);
	}
	public final static int LUCKY_NUMBER = 13 ;
}


public class App {
	public static void main(String[] args){
		
		System.out.println("count" + Thing.getCount());
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("count" + Thing.getCount());
		Thing.description = "I am a thing";
		
		/* test */
		
		
		
		Thing.showInfo();
		
		thing1.name = "bob";
		thing2.name = "sure";
		
		thing1.showName();
		thing2.showName();
		System.out.println(Thing.LUCKY_NUMBER);
	}
}