package Interface;
//created a SmartPhone object that uses the Device interface methods and then called 
//its functions like call(), turnOn(), turnOff(), status(), along with the static manufacturer() method."

public interface Interface3 {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.call();
		s.turnOn();
		s.turnOff();
		s.status();
		Device.manufacturer();
		
	}

}
