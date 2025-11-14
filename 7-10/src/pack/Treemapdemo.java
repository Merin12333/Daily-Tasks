package pack;

import java.util.Set;
import java.util.TreeMap;

public class Treemapdemo {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap<Integer,String>();
		tm.put(3,"Mango");
		tm.put(4, "Apple");
		tm.put(3, "Grapes");
		System.out.println(tm);
		Set<Integer> s= tm.keySet();
		for(int x:s) {
			System.out.println(x);
		}
	}

}
