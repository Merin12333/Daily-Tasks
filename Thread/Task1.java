package Thread;
class Order extends Thread{
	public void run() {
		System.out.println("Order Placed");
		
	}
}
class Prepare extends Thread{
	public void run() {
		System.out.println("Preparing Food");
		
	}
}
class Deliverthread extends Thread{
	public void run() {
		System.out.println("Out of Delivery");
		
	}
}

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		Order th1=new Order();
		Prepare th2=new Prepare();
		Deliverthread th3= new Deliverthread();
		
		th1.start();
		th1.join();
		Thread.sleep(3000);
		th2.start();
		th2.join();
		Thread.sleep(3000);
		th3.start();
		th3.join();
		Thread.sleep(3000);
		
	}

}
