package Assignment_3_Array;

import java.util.Scanner;

public class Q8_searchElement
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
		
		System.out.println("enter the search element");
		int s=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
				count++;
			}
		}
		
		if(count>0)
		{
			System.out.println("item found");
		}
			
	}

}
