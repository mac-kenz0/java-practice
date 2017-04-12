package tutorial35;

import java.util.ArrayList;

/*
 * Generics and Wildcards
 * 
 * */
class Machine{

	@Override
	public String toString() {
		return "I am a machine";
	}
	public void start(){
		System.out.println("machine starting");
	}

	
}
class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	public static void snap(){
		System.out.println("camera snappign");
	}
}
public class App {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		showList(list1);
		
		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());
		showList(list2);	
		
		
	}
	public static void showList(ArrayList<? extends Machine> list){
		for (Machine value : list){
			System.out.println(value);
			value.start();
		}
	}

}
