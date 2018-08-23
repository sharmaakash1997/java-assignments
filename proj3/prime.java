import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  int i,j,count=0;
  Scanner sn= new Scanner(System.in);
  System.out.println("Enter number:");
  i=sn.nextInt();
  for(j=2;j<i;j++)
  {
   if(i%j==0)
   {
    count=count+1;
   }
  }
  if(count>0)
  {
   System.out.println("it is not a prime number");
  }
  else if(count ==0)
   {
   System.out.println("it is a prime number");
   }
  
 }
}