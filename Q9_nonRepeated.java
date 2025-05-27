package Assignment_3_String;

import java.util.Scanner;

public class Q9_nonRepeated 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
				
		for(int i=0;i<str.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<str.length()-1;j++)
			{
				if(i!=j&&str.charAt(i)==str.charAt(j)) 
				{
					unique=false;
				}
			}
		
			if(unique)
			{
				System.out.println("first unique character is = "+str.charAt(i));
				break;
			}
		}
		
	}

}
