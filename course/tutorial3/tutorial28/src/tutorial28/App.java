package tutorial28;
/* 
 * Interfaces Tutorial
 * */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();
		m1.start();
		
		Person p = new Person ("Kenzo");
		p.greet();
		// you can assign object Machine to Interface info because 
		// machine does implement Info interface
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = p;
		info2.showInfo();
		
		outputInfo(m1);
		outputInfo(p);
	}
private static void outputInfo (Info info) {
	info.showInfo();
}
}
