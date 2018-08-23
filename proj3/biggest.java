import java.util.Scanner;
class Biggest
{
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		float x,y,z;
		System.out.println("Enter three numbers :");
		x=sn.nextFloat();
		y=sn.nextFloat();
		z=sn.nextFloat();
		if(x>y && x>z)
			System.out.println("Biggest number is:"+x);
		else if (y>x && y>z)
			System.out.println("Biggest number is :"+y);
		else if(z>x && z>y)
			System.out.println("Biggest number is :"+z);
	}
}
			