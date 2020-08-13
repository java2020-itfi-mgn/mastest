package lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread	t = new Thread(()-> {
				try(final DatagramSocket	ds = new DatagramSocket(new InetSocketAddress("192.168.0.104",2000))) {
					final DatagramPacket	pack = new DatagramPacket(new byte[100],100);
					
					ds.receive(pack);
					System.err.println("Content="+new String(pack.getData(),0,pack.getLength()));
				} catch (IOException e) {
				}
		});
		t.setDaemon(true);
		t.start();

		try(final DatagramSocket	ds = new DatagramSocket(2001)) {
			final byte[]			buffer = "test string".getBytes();
			final DatagramPacket	pack = new DatagramPacket(buffer,buffer.length
												,new InetSocketAddress("192.168.0.255",2000));
			
			ds.send(pack);
		} catch (IOException e) {
		}
	}

}
