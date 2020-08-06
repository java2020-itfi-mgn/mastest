package lesson13;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream 	is = new InputStream() {	// /dev/null ?
							@Override
							public int read() throws IOException {	// read() == -1 - EOF, else (byte)read() 
								return -1;
							}
						};
		OutputStream 	os = new OutputStream() {	// /dev/null ?
							@Override
							public void write(int b) throws IOException {	//(byte)b
							}
						};

						
//		byte[]	result;
		try(final OutputStream			baos = new FileOutputStream("d:/test.txt");
			final Writer				wr = new OutputStreamWriter(baos)) {	// implements java.lang.AutoCloseable
																				// java.io.Closeable
			wr.write("test string");
			wr.flush();
			
			System.err.println("Content="+baos.toString());
			
//			result = baos.toByteArray();
		} // finally {baos.close()}

		try(final InputStream	bais = new FileInputStream("d:/test.txt");//new ByteArrayInputStream(result);
			final Reader		rdr = new InputStreamReader(bais);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
//			char[]		buffer = new char[100];
//			
//			int 		length = rdr.read(buffer);
			
//			System.err.println("Length="+length);
//			System.err.println("Content="+new String(buffer,0,length));
			System.err.println("Content="+brdr.readLine());
		}
	
	}
}
