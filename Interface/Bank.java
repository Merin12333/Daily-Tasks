package Interface;

public interface Bank {
	public void getRateOfInterest();
	public void getBankName();

}
class SBI implements Bank{
 
	@Override
	public void getRateOfInterest() {
		
		double interest=5.5;
		System.out.println("Rate of Interest  "+interest+"%");
		
	}

	@Override
	public void getBankName() {
		String bname="SBI";
		System.out.println("Bank Name  "+bname);
		
	}
	
}
class HDFC implements Bank{

	@Override
	public void getRateOfInterest() {
		double interest=6.0;
		System.out.println("Rate of Interest  "+interest+"%"); 
		
	}

	@Override
	public void getBankName() {
		String bname="HDFC";
		System.out.println("Bank Name  "+bname);
		
	}
	
}
class ICICI implements Bank{

	@Override
	public void getRateOfInterest() {
		double interest=5.75;
		System.out.println("Rate of Interest  "+interest+"%");
		
	}

	@Override
	public void getBankName() {
		String bname="ICICI";
		System.out.println("Bank Name  "+bname);
		
	}
	
}