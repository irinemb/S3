import java.util.*;
class palindrome
{
	public static void main(String a[])
	{
  	String word,rev="";
		System.out.println("Enter the string ");
    Scanner s=new Scanner(System.in);
		word=s.nextLine();
		int len=word.length();
		word=word.toLowerCase();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		if(word.equals(rev))
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given string is not a palindrome");
	}
}
