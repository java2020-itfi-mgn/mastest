package lesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class MyLoader extends ClassLoader {
	public MyLoader(ClassLoader parent) {
		super(parent);
	}
	
	@Override
	public Class<?> loadClass(final String className) throws ClassNotFoundException {
		if (className.endsWith("ZZZ")) {
			try(final Duration		d = new Duration();
				final InputStream	is = new FileInputStream("./bin/lesson12/ZZZ.class")) {	// java.lang.AutoCloseable
				final byte[]		buffer = new byte[10000];
				final int			len = is.read(buffer);

				return defineClass(className,buffer,0,len);
			} catch (IOException e) {
				throw new ClassNotFoundException(className);
			} // finally { is.close(); }
		}
		else {
			return super.loadClass(className);
		}
	}
}


class Duration implements AutoCloseable {
	private final long	startTime =  System.nanoTime();
	public Duration() {
	}
	
	public void close() throws RuntimeException {
		System.err.println("Duration = "+(System.nanoTime()-startTime));
	}
}