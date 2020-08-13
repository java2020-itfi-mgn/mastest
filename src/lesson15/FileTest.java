package lesson15;

import java.io.File;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File	f = new File("d:/");
		
		System.err.println("Exists? "+f.exists());
		System.err.println("Dir? "+f.isDirectory());
		System.err.println("Content="+Arrays.toString(f.list()));

		File	dir = new File("d:/newDir");
		
		System.err.println("Exists? "+dir.exists());
		System.err.println("Created? "+dir.mkdirs());
		
	}
}
