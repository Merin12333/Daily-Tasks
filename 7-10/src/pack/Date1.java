package pack;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) throws ParseException {
		String str="22/05/2025";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy ");
		Date d=sdf.parse(str);
		System.out.println(d.getDate()+"/"+d.getMonth());
	}

}
