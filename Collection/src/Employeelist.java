import java.util.ArrayList;

public class Employeelist {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid(1);
		e.setEmpname("Merin");
		e.setEnmpsal(40000);
		Employee e2=new Employee();
		e2.setEmpid(2);
		e2.setEmpname("Sreelakshmi");
		e2.setEnmpsal(450000);
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(e);
		al.add(e2);
		System.out.println(al);
//		for (Employee e1 :al) {
//			System.out.println(e1);
//		}
	}

}
