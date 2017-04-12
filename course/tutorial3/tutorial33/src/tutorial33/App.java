package tutorial33;
class Machine {
	public void start(){
		System.out.println("machine started");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started");
	}
	public void snap(){
		System.out.println("Photo taken");
	}
}
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// upcasting
		Machine machine2 = camera1;
		machine2.start();
		// error : machine2.snap();
		// the type of the variable determines which methods can be called
		// the actual object assigned to the variable (instanciation)
		// determines which method is called
		
		// downcasting
		Machine machine3 = new Camera();
		// have to cast the object to use methods
		// need confirmation because downcasting is unsafe
		Camera camera2 = (Camera)machine3;
		
		// upcasting is safe
		// downcasting only get errors at runtime v unsafe

	}

}
