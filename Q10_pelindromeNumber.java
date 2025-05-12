package Assignment_3;

import java.util.Scanner;

public class Q10_pelindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		if(num1==sum)
		{
			System.out.println("it is pelindrome number");
		}
		else
		{
			System.out.println("it is not pelindrome number");
		}
		
	}

}
