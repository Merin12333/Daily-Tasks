package Interface;

public interface Device {
	public void turnOn();
	public void turnOff();
	default void status() {
		System.out.println("Device is Operational");
		
	}
	public static void manufacturer() {
	System.out.println("Manufactured by UST Global");	
	}

}
 class SmartPhone implements Device{
	 public void call() {
		 System.out.println("Smartphone is turn On..");
	 }

	@Override
	public void turnOn() {
		System.out.println("Smartphone is making a call..");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smatphone is turn off..");
	}
	 
 }
 