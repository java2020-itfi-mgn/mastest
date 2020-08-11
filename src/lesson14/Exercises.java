package lesson14;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Exercises {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final OutputStream			baos = new FileOutputStream("d:/content.zip");
			final ZipOutputStream		zos = new ZipOutputStream(baos)) {
			
			ZipEntry	ze = new ZipEntry("part1");
			
			ze.setMethod(ZipEntry.DEFLATED);
			zos.putNextEntry(ze);
			
			ObjectOutputStream	oos = new ObjectOutputStream(zos);
			oos.writeObject(new Human("ivanov","ivan","ivanovich"));
			oos.flush();
		}
	}

}
