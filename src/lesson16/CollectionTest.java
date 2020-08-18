package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionTest<T> {

	private T	value;		// private Object value;	private Number value;
	
	public T getValue() {
		return value;
	}

	public <T> T get(Class<T> value) {
		if (value == boolean.class) {
			return (T)Boolean.valueOf(true);
		}
		else {
			return (T)"test";
		}
	}

	public void setValue(T newValue) {
		value = newValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterable<?>	it = new ArrayList<>();

		
		CollectionTest<Long>	ct = new CollectionTest<>();

		if (ct.get(boolean.class)) {
			String s = ct.get(String.class);
		}
		
//		Iterator	i = it.iterator();
//		
//		while (i.hasNext()) {
//			Object	value = i.next();
//		}
		
		for (Object item : it) {
			
		}
		
		List		list = new ArrayList();
		
		System.err.println("Size: "+list.size());
		list.add("test string 1");
		
		System.err.println("Size: "+list.size());
		System.err.println("Value[0]: "+list.get(0));
		
		list.set(0,"test new string");
		System.err.println("Value[0] new: "+list.get(0));

		list.add(0,"added test new string");
		
		for (Object item : list) {
			System.err.println("Content: "+item);
		}
		System.err.println("remove[0]="+list.remove(0));
		
		List<String>	newList = new ArrayList<String>();
		
		newList.add(/*(String)*/"test string");
		System.err.println("Content: "+/*(String)*/newList.get(0));
		
		Set<String>		set = new HashSet<>(), set1 = new HashSet<>();
		
		set.add("test");
		set.add("test");
		
		set.addAll(set1);		// set U set1
		set.retainAll(set1);	// set ^ set1
		set.removeAll(set1);	// set - set1
		
		set.contains("test");
		
		for (String item : set) {
			
		}
		
		Map<String,Integer>	map = new HashMap<>();
		
		System.err.println("Size="+map.size());
		System.err.println("Old="+map.put("key1",100));
		System.err.println("Old="+map.put("key2",200));
		System.err.println("Old="+map.put("key2",300));

		for (String key : map.keySet()) {
			
		}
		for (Integer value : map.values()) {
			
		}
		for (Entry<String, Integer> item : map.entrySet()) {
			item.getKey();
			item.getValue();
		}

		List<Integer>	l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		// Stream.of(10,20,30,40) | filter((x)->x > 20) | forEach((x)->System.err.println("x="+x));
		l.stream().filter((x)->x > 20).forEach((x)->System.err.println("x="+x));
	}
}
