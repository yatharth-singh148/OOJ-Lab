import java.util.*;
import java.util.Scanner;
abstract class Shape
{
	int l;
	int b;
	abstract void printArea();
}
class Rectangle extends Shape
{
	void printArea()
	{
		int area=l*b;
		System.out.println("Area of rectangle is: "+area);
	}
}
class Triangle extends Shape
{
	void printArea()
	{
		double area=0.5*l*b;
		System.out.println("Area of triangle is: "+area);
	}
}
class Circle extends Shape
{
	void printArea()
	{
		double area=(22/7)*l*l;
		System.out.println("Assuming radius as "+l+", area of circle is: "+area);
	}
}
class ShapeArea
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		int ch;
		System.out.println("Enter your choice:\n1 -> Rectangle\n2-> Triangle\n3 -> Circle");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter length and breadth of rectangle: ");
			r.l=sc.nextInt();
			r.b=sc.nextInt();
			r.printArea();
			break;
			case 2:
			System.out.println("Enter height and base of triangle: ");
			t.l=sc.nextInt();
			t.b=sc.nextInt();
			t.printArea();
			break;
			case 3:
			System.out.println("Enter radius of circle: ");
			c.l=sc.nextInt();
			
			c.printArea();
			break;
			default:
			System.out.println("Enter valid option!");
			break;
		}
			
	}
}


