package Assignment_3_Array;

import java.util.Scanner;

public class Q6_Copy_oneTOanother 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		
		System.out.println("enter array element");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("copy one array to another array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}

		
		
	}


}
