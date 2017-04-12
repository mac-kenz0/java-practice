package tutorial32;
/* You should probably do a handful of exercises
 * regarding casting and the byte values of Java
 * 
 * */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 888;
		short shortValue = 55;
		byte byteValue = 20;
		long longValue = 24554;
		
		float floatValue = 842.4f;
		double doubleValue = 42.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		
		System.out.println(intValue);
		doubleValue = intValue;
		
		System.out.println(doubleValue);
	}

}
