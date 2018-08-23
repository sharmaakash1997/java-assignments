import java.util.Scanner;
class Rectangle
{
	public float CalculateArea()
	{
		float l,b,a;
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter length and breadth=");
		l=sn.nextFloat();
		b=sn.nextFloat();
		a=l*b;
		return a;
	}
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		System.out.println("Area of rectangle is "+r.CalculateArea());
	}
}