package lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TCP	- ServerSocket, Socket
		// HTTP/HTTPS/FTP/FTPS/ - URL	(HttpServer)
		// UDP  - DatagramSocket, DatagramPacket
		Thread	t = new Thread(()-> {
						try(final ServerSocket		ss = new ServerSocket(2000)) {
							try(final Socket		s = ss.accept();
								final InputStream	is = s.getInputStream();
								final OutputStream	os = s.getOutputStream();
								final Writer		wr = new OutputStreamWriter(os);
								final Reader		rdr = new InputStreamReader(is);
								final BufferedReader	brdr = new BufferedReader(rdr)) {
								// ------------------------------
								System.out.println("Port="+s.getPort());
							
								wr.write(brdr.readLine().toUpperCase());
								wr.flush();
								
							}
						} catch (IOException e) {
						}
				});
		t.setDaemon(true);
		t.start();

		try(final Socket	s = new Socket("localhost",2000);
			final InputStream	is = s.getInputStream();
			final OutputStream	os = s.getOutputStream();
			final Writer		wr = new OutputStreamWriter(os);
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			// ------------------------------
			System.err.println("Port="+s.getLocalPort());
			
			wr.write("test string\n");
			wr.flush();
			
			System.err.println("REsponse="+brdr.readLine());
		} catch (IOException e) {
		}
		
	}

}
