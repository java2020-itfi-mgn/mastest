package lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Exercises {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1. Manually create file c:\test.txt (3 lines with families)
		// 2. Read file content and print it to the console
		// 
		// TODO:
		//	1. Read string from System.in	// InputStream
		//  2. Make uppercase for it
		//  3. Print it to System.out		// PrintStream
		Writer wr = new OutputStreamWriter(System.out);
		
		wr.write(
				new BufferedReader(new InputStreamReader(System.in)).readLine().toUpperCase()
		);
		wr.flush();
	}

}
