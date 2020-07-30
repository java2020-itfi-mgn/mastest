package lesson11;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, FIELD })
public @interface MyAnnotation {	// final extends java.lang.Annotation
	int length() default 0;
	String text();
	Class myClass();
	MyEnum item();
	int[] records() default {1,2,3,4,5};
}
