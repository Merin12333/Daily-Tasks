package Thread;
class Thread1 implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<=5;i++) {
			System.out.println("Loading game");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<=5;i++) {
			System.out.println("Playing game");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}

public class Task2 {
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		Thread th1=new Thread(t);
		th1.start();
		Thread2 t2=new Thread2();
		Thread th2=new Thread(t2);
		th2.start();
		
	}

}
