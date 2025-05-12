package Assignment_1;

import java.util.Scanner;

public class Q11_calculateArea 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		double r=sc.nextDouble();
		
		double area=2*Math.PI*r;
		System.out.println("circumference of circle is : "+area);
		
	}

}
