package tutorial37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "textFile.txt";
		File textFile = new File(fileName);
		Scanner scan = new Scanner(textFile);
		
		while (scan.hasNext()){
			String line = scan.nextLine();
			System.out.println(line);
		};
		scan.close();
	}

}
