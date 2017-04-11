package tutorial26;

public class APp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine mc1 = new Machine();
		
		mc1.start();
		mc1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.stop();
		car1.wipeWindshield();
		car1.showInfo();
	}

}
