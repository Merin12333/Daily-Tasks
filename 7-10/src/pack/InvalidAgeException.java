package pack;

public class InvalidAgeException {
	int age;
	public InvalidAgeException(int age) {
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "InvalidAgeException [age=" + age + "]";
	}

}
