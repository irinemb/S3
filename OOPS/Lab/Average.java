import java.util.*;
class avg
{
    public static void main(String ar[]) 
    {
        Scanner s =new Scanner(System.in);
        int a,b;
        System.out.println("Enter two integers");
        a=s.nextInt();
        b=s.nextInt();
        float avg=(a+b)/2;
        System.out.println("The average is "+avg);
        s.close();
     }
}
