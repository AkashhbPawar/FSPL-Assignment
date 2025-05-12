package Assignment_1;

import java.util.Scanner;

public class Q10_fahrenheit_celsius
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit");
		double fahrenheit=sc.nextDouble();
		
		double celsius=(fahrenheit-32)*5.0/9.0;
		System.out.println("temperature of celsius is :"+celsius);
		
	}

}
