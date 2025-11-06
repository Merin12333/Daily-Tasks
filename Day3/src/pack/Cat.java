package pack;

public class Cat {
//	public String toString() {
//		return"Cat Object";
//	}
//public static void main(String[] args) {
//	Cat c=new Cat();
//	System.out.println(c);
//}
	Cat(){
		this(4);
		System.out.println("Cat Constructor");
	}
	Cat(int x){
		this("Tom");
		System.out.println("Cat"+x+"legs");
	}
	Cat (String name){
		
		System.out.println("Cat name is"+name);
		eat();
	}
	void eat() {
		this.eat(2);
		System.out.println("Eat Rats");
		
	}
	void eat(int x) {
		System.out.println("Eat"+x);
	}
	public static void main(String[] args) {
	new Cat();
	}
}
