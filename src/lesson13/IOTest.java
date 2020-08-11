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
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

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
			final GZIPOutputStream		gzos = new GZIPOutputStream(baos);		
			final Writer				wr = new OutputStreamWriter(gzos)) {	// implements java.lang.AutoCloseable
																				// java.io.Closeable
			wr.write("test string");
			wr.flush();
			
			System.err.println("Content="+baos.toString());
			
//			result = baos.toByteArray();
		} // finally {baos.close()}

		try(final InputStream		bais = new FileInputStream("d:/test.txt");//new ByteArrayInputStream(result);
			final GZIPInputStream	gzis = new GZIPInputStream(bais);		
			final Reader			rdr = new InputStreamReader(gzis);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
//			char[]		buffer = new char[100];			WRONG method to read!
//			
//			int 		length = rdr.read(buffer);

//			int 		length, displ = 0;				RIGHT method to read
//			
//			while ((length = rdr.read(buffer,displ,buffer.length-displ)) > 0) {	// 
//				displ += length;
//			}
			
//			System.err.println("Length="+length);
//			System.err.println("Content="+new String(buffer,0,length));
			System.err.println("Content="+brdr.readLine());
		}
	
	}
	
	static void process(final InputStream is) {
		// is - DON'T CLOSE!!!
		// .read()
		// Буферизованный ввод не открывать!
	}

	static void process(final OutputStream is) {
		// is - DON'T CLOSE!!!
		// .write()
		// .flush()
	}
}
