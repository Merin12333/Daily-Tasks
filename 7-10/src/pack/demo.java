package pack;

import java.util.Calendar;

public class demo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
	}

}
