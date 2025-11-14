package Interface;

public class Interface1  {
	public static void main(String[] args) {
		Shape circle=new Circle();
		Shape rectangle=new Rectangle();
		circle.area();
		circle.perimeter();
		rectangle.area();
		rectangle.perimeter();
	}

}
