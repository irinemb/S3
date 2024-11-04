import java.util.*;
class integersum
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a line of integers seperated by sapces");
String line=sc.nextLine();
String[] numbers=line.split(" ");
int sum=0;
System.out.println("The integers are ");
for(String number:numbers)
{
 int num=Integer.parseInt(number);
 System.out.println(num);
 sum+=num;
}
 System.out.println("The sum of all integers is "+sum);
 sc.close();
 }
 }
