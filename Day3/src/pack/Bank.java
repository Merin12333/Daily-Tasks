package pack;

public class Bank {
	int amount=2000;
	
void balance() {
	System.out.println("Amount balance is"+amount);
}
void withdraw(int amount) {
	if(amount >this.amount) { 
	System.out.println("Insufficient");
	return;
	}
	this.amount -=amount;
	
}

public static void main(String[] args) {
	Bank b1=new Bank();
	b1.balance();
	b1.withdraw(500);
	b1.balance();
}
}
