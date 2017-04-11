package tutorial28;


public class Machine implements Info{
private int id = 14;
public void start(){
	System.out.println("start");
}

@Override
public void showInfo() {
	System.out.println("machine id" + id);
	
}
}
