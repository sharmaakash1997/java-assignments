import java.util.Scanner;
import java.util.Arrays;
class Array
{
	public void lar()
	{
		Scanner sn=new Scanner(System.in);
		int x;
		int[] arr =new int[10];
		System.out.println("Enter the elements :");
		for (int i=0;i<10;i++)
		{
			arr[i]=sn.nextInt();
		}
		 for (int i=0;i<10;i++) //sort
        {
            for (int j=i+1;j<10;j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
		System.out.println("Second laargest element is : "+arr[10-2]);
	}
	public static void main(String args[])
	{
		Array a=new Array();
		a.lar();
	}
} 