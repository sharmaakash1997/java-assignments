import java.util.Scanner;
class Complex
{
	static int r,i;
	public void Display(int real,int imag)
	{
		System.out.println("output is : "+r+"+"+i+"i");
	}
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		Complex c=new Complex();
		System.out.print("Enter the real part : ");
		r=sn.nextInt();
		System.out.print("Enter the imaginary part : ");
		i=sn.nextInt();
		c.Display(r,i);
	}
}