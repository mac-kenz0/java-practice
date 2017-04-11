package tutorial26;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("start car");
	}

	public void wipeWindshield (){
		System.out.println("wiping windshield");
	}
	public void showInfo(){
		System.out.println("car name: "+ name);
	}
}
