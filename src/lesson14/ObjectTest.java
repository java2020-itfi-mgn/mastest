package lesson14;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ObjectTest implements Serializable {
	private static final long serialVersionUID = 7417120751401128184L;
	
	public transient int x = 20;
	public int y = 40;
	public Object z = null;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try(final ByteArrayOutputStream	baos = new ByteArrayOutputStream();
			final ObjectOutputStream	dos = new ObjectOutputStream(baos)) {
			
			dos.writeBoolean(true);
			dos.writeLong(12345);
			dos.writeDouble(12.3);
			dos.writeUTF("test string");
			dos.writeObject(new String[] {"123","456","789"});	// implements Serializable
			
			ObjectTest ot1 = new ObjectTest();
			
			dos.writeObject(ot1);
			dos.writeObject(ot1.new ZZZ());
			dos.writeObject(ot1.new ZZZ());
			dos.reset();	// Reset cache!!!!!
			dos.flush();
			
//			System.err.println("Content="+baos.toString());
			
			try(final ByteArrayInputStream	bais = new ByteArrayInputStream(baos.toByteArray());
				final ObjectInputStream		dis = new ObjectInputStream(bais)) {
			
				System.err.println("boolean: "+dis.readBoolean());
				System.err.println("long: "+dis.readLong());
				System.err.println("double: "+dis.readDouble());
				System.err.println("String: "+dis.readUTF());
				System.err.println("Object: "+Arrays.toString((String[])dis.readObject()));
				
				ObjectTest ot = (ObjectTest)dis.readObject();
				System.err.println("Object: "+ot.x+", "+ot.y+" "+ot.z);

				ZZZ z1 = (ZZZ)dis.readObject();
				ZZZ z2 = (ZZZ)dis.readObject();

				z1.print();
				z2.print();
			}
		}
	}

	private class ZZZ implements Serializable {
		void print() {System.err.println(ObjectTest.this);}
	}
}
