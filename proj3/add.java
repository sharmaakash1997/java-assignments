import java.util.Scanner;
class Add
{
public static void main(String args[])
{
	Scanner sn=new Scanner(System.in);
	double a,b,c;
	System.out.println("Enter numbers=");
	a=sn.nextDouble();
	b=sn.nextDouble();
	c=a+b;
	System.out.println("Sum of numbers is= "+c);
}
}