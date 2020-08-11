package lesson14;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1. MAGIC 'PK'
		// 2. Zip parts	 // - header. - body	/a/b, /a/c
		// 3. Zip content	// - header 
		
		try(final ByteArrayOutputStream	baos = new ByteArrayOutputStream();
			final ZipOutputStream		zos = new ZipOutputStream(baos)) {
		
			ZipEntry	ze = new ZipEntry("part1");
			
			ze.setMethod(ZipEntry.DEFLATED);
			zos.putNextEntry(ze);
			
			Writer	wr = new OutputStreamWriter(zos);
			wr.write("part 1 content");
			wr.flush();
			
			ze = new ZipEntry("part2");
			
			ze.setMethod(ZipEntry.DEFLATED);
			zos.putNextEntry(ze);
			
			wr = new OutputStreamWriter(zos);
			wr.write("part 2 content");
			wr.flush();
			
			zos.finish();	// optional...
			
			System.err.println("Content="+baos.toString());
			
			try(final ByteArrayInputStream	bais = new ByteArrayInputStream(baos.toByteArray());
				final ZipInputStream		zis = new ZipInputStream(bais)) {
			
				while ((ze = zis.getNextEntry()) != null) {
					System.err.println("Name="+ze.getName());
					Reader			rdr = new InputStreamReader(zis);
					BufferedReader	brdr = new BufferedReader(rdr);
					
					System.err.println("Content="+brdr.readLine());
				}
			}
		}
	}

}
