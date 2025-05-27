package Assignment_3_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q6_countOfFrequency 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		
		Map<Character, Integer> fm=new HashMap<>();
		for(char ch: str.toCharArray())
		{
			if(fm.containsKey(ch))
			{
				fm.put(ch, fm.get(ch)+1);
			}
			else
			{
				fm.put(ch, 1);
			}
		}
		
		System.out.println("character frequencies");
		for(Map.Entry<Character, Integer> entry:fm.entrySet())
		{
			System.out.println(entry.getKey()+ ":" +entry.getValue());
		}
		
	}
	

}
