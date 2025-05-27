package Assignment_3_String;

import java.util.Scanner;

public class Q10_replaceOccurrence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		
		System.out.println("replace character");
		System.out.println(str.replaceAll("a", "o"));
		
	}

}
