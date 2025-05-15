package Assignment_3;

import java.util.Scanner;

public class Q10_margeArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size+size];


		
		System.out.println("enter the element array1");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the element array2");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[arr1.length+i]=arr2[i];
		}
		
		System.out.println("marge array");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		
	}

}
