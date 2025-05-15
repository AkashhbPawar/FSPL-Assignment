package Assignment_3;

import java.util.HashSet;
import java.util.Scanner;

public class Q6_removeDuplicate 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		HashSet hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		System.out.println("remove duplicate");
		System.out.println(hs);
		
		
		
	}

}
