package Assignment_3;

import java.util.Scanner;

public class Q1_even_odd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is not even number");
		}
	}

}
