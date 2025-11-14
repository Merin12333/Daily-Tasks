package Interface;
//used an interface to create different bank classes and then called their methods to display 
//each bank’s name and rate of interest."

public class Interface2 {
	public static void main(String[] args) {
		Bank s=new SBI();
		s.getBankName();
		s.getRateOfInterest();
		Bank h=new HDFC();
		h.getBankName();
		h.getRateOfInterest();
		ICICI i=new ICICI();
		i.getBankName();
		i.getRateOfInterest();
	}

}
