package Assignment_1;

import java.util.Scanner;

public class Q3_name_age1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int userid=sc.nextInt();
		
		if(userid==1)
		{
			System.out.println("name:jake");
			System.out.println("age:24");
		}
		else
		{
			System.out.println("user is not found");
		}
	}

}
