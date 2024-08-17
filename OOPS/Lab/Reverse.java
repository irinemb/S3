import java.util.*;
class reverse
{
	public static void main(String ar[])
	{
    String word,rev="";
		System.out.println("Enter the string: ");
    Scanner sc=new Scanner(System.in);
		word=sc.nextLine();
		int len=world.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		System.out.println("The reversed string is "+rev);
	}
}
