package Assignment_3_Array;

import java.util.Scanner;

public class Q2_sumOfElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of all element is = "+sum);
		
		
	}
	

}
