import java.util.*;
class prime
{
public static void main(String a[])
{
 int n,i,c=0;
 System.out.println("Enter the number");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
  if(n%i==0)
  {
  c++;
  }
  }
  if(c==2)
  {
  System.out.println("The given number is a prime number");
  }
  else
  {
  System.out.println("The given number is not a prime number");
  }
  }
  }
  
  
 
