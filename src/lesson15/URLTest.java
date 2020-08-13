package lesson15;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		final URI			uri = URI.create("http://winmain:58113/static/../ru/overview.cre?x=y");
		final URL 			url = uri.toURL();

		File	f = new File("d:/z.txt");
		System.err.println("URI: "+f.toURI());
		
//		final URLConnection	conn = url.openConnection();
		final HttpURLConnection	conn = (HttpURLConnection)url.openConnection();

		conn.setDoInput(true);		// GET
		conn.setDoOutput(true);		// POST
		conn.setRequestMethod("POST");
		conn.setRequestProperty("a","b");
		// conn.getOutputStream();
		
		try(final InputStream		is = conn.getInputStream();
			final Reader			rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
		
			System.err.println("content="+brdr.readLine());
	}
	}

}
