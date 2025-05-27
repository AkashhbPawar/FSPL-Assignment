package Assignment_3_String;

import java.util.Scanner;

public class Q4_pelindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) 
		{
			System.out.println("string is pelindrome");
		}
		else
		{
			System.out.println("string is not pelindrome");

		}
		
	}

}
