package Assignment_3_Array;

import java.util.Scanner;

public class Q5_countEven_Odd 
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
		
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("count of even number is = "+evencount);
		System.out.println("count of odd number is = "+oddcount);

		
		
	}

}
