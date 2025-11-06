import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Grapes");
		
		//System.out.println(al);
//		for(Object o:al) {
//			System.out.println(o);
		Iterator itr=al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		al.forEach(x->{System.out.println(x);});
		
	}
	

}
