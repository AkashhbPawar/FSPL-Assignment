package Assignment_3;

import java.util.Scanner;

public class Q7_MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
				System.out.print(num*i+" ");
		}
		
	}

}
