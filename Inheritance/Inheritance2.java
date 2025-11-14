package Inheritance;

class Employee1{
	String name;
	
	public Employee1(String name) {
		super();
		this.name = name;
	}
	double calculateSalary() {
		return 0;
	}
	
}
class FullTimeEmployee extends Employee1{
	double monthlySalary;

	public FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}
	
	double calculateSalary() {
		return monthlySalary;
		
	}

	
}
class Contractor extends Employee1{
	double hourlyRate;
	double totalHours;
	public Contractor(String name, double hourlyRate, double totalHours) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.totalHours = totalHours;
	}
	double calculateSalary() {
		return hourlyRate*totalHours;
		
	}
	
}
public class Inheritance2 {
	public static void main(String[] args) {
		Employee1 e=new FullTimeEmployee("Merin", 35000);
		Employee1 e2=new Contractor("Ayisha",45000,4 );
		 System.out.println(e.name+" Salary : "+e.calculateSalary());
		 System.out.println(e2.name+" Salary : "+e2.calculateSalary());
		
	}

}
