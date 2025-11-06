
public class Employee {
	private int Empid;
	private String Empname;
	private int Enmpsal;
	public Employee(int empid, String empname, int enmpsal) {
		
		Empid = empid;
		Empname = empname;
		Enmpsal = enmpsal;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEnmpsal() {
		return Enmpsal;
	}
	public void setEnmpsal(int enmpsal) {
		Enmpsal = enmpsal;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Enmpsal=" + Enmpsal + "]";
	}

}
