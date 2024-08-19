import java.util.*;
class sum
{
    public static void main(String ar[]) 
    {
        Scanner s =new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two digits");
        a=s.nextInt();
        b=s.nextInt();
        
        int c=a+b;
        System.out.println("The sum is "+c);
        s.close();
    }
}
