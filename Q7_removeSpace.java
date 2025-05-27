package Assignment_3_String;

import java.util.Scanner;

public class Q7_removeSpace
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		System.out.println("remove space");
		System.out.println(str.replaceAll(" ", ""));
		
	}

}
