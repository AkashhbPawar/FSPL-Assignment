package Assignment_3_String;

import java.util.Scanner;

public class Q8_compareTWOstring 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.next();
		System.out.println("enter the second string");
		String str2=sc.next();
		
		if(str1.equals(str2))
		{
			System.out.println("string is equal");
		}
		else
		{
			System.out.println("string is not equal");
		}
		
	}

}
