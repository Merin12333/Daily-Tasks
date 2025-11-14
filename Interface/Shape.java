package Interface;

public interface Shape {
public double area();
public double perimeter();
}

class Circle implements Shape{
  double pi=  3.14;
	public double area() {
		int r = 4;
		double area = pi*r*r;
		System.out.println("Area of Circle "+area);
		return area;
	}

	public double perimeter() {
		int r=4;
		double perimeter=2*pi*r;
		System.out.println("Perimeter of Circle " +perimeter);
		return perimeter;
	}
	
}

class Rectangle implements Shape{

	@Override
	public double area() {
		int l=3;
		int b=4;
		int area = l*b;
		System.out.println("Area of Rectangle "+area);
		
		return area;
	}

	@Override
	public double perimeter() {
		int l=3;
		int b=4;
		int peri= 2*(l+b);
		System.out.println("Perimeter of Rectangle "+peri);
		
		return peri;
	}
	
}
 
	
 
