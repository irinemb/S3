import java.util.*;
class exception
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("[1]try&catch block\n[2]throw error\n[3]finally");
int opt=sc.nextInt();
if(opt==1)
{
int[] num={1,2,3};
try
{
System.out.println(num[10]);
}
catch(Exception e)
{
 System.out.println("Try&catch Executed successfully");
 }
 }
 else if(opt==2)
 {
 throw new ArithmeticException("/ by zero");
 }
 else
 {
 try{
 int a=2/0;
 }
 finally
 {
 System.out.println("finally block executed");
 }
 }
 }
 }
