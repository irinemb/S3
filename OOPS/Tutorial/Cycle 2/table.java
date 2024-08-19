import java.util.*;
class table
 {
   public static void main(String a[])
   {
   int i,num,range;
    {
     System.out.println("Enter the number for the multiplication table");
     Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
     System.out.println("Enter the range");
     range=sc.nextInt();
     for(i=0;i<=range;i++)
      {
       System.out.print(num+"*"+i+"="+num*i);
      }
     }
    }
  }
