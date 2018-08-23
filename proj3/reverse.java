import java.util.Scanner;
class Reverse
{
 public static void main(String args[])
 {
  int a,temp=0,b;
  Scanner sn=new Scanner(System.in);
  System.out.println("Enter number:");
  a=sn.nextInt();
  while(a>0)
  {
   b=a%10;
   temp=temp*10+b;
   a=a/10;
  }
  System.out.println("reverse of the number is "+temp);
 }
}