package pack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap<Integer,String>();
		hm.put(3, "Mango");
//		hm.put('x',33.44f);
//		hm.put("A", 55);
		hm.put(4, "Apple");
		System.out.println(hm.containsValue(55));
	//	System.out.println(hm.get('x'));
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+m.getValue());
		}
		
	}

}
