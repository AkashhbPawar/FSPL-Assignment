package Assignment_3;

import java.util.Scanner;

public class Q11_ArmstrongNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int count=0;
		int sum=0;
		int num1=num;
		int num2=num1;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		while(num1>0)
		{
			int rem=num1%10;
			sum=sum+isfact(count,rem);
			num1=num1/10;
		}
		
		if(num2==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
		
	}
	
	public static int isfact(int count,int rem)
	{
		int fact=1;
		for(int i=1;i<=count;i++)
		{
			fact=fact*rem;
		}
		return fact;
	}

}