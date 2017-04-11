package tutorial16;


class Robot {
	public void speak(String s){
		System.out.println("Hello");
		System.out.println(s);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam = new Robot();
		sam.speak("yolo");
	}

}
