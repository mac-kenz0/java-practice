package tutorial12;

public class Yolo {
public static void main(String[] args){
	//int[] values = {3,5, 2443};
	int[][] valueDouble = {{2,3}, {5,4}, {2,4,5,3}};
	
	for (int i =0; i < valueDouble.length; i++){
		for (int j = 0; j < valueDouble[i].length; j++){
			System.out.print(valueDouble[i][j] + "\t");
		}
		System.out.println("\n");
	}
}
}
