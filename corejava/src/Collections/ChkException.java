package Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkException {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("abcd.txt");
		
		FileInputStream stream=new FileInputStream (file);

	}

}
