package Assignment_3;

public class Q9_pelindromeNo 
{
	public static void main(String[] args) 
	{
		int num=121;
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		if(num1==sum)
		{
			System.out.println("it is pelindrome number");
		}
		else
		{
			System.out.println("it is not pelindrome number");
		}
		
	}

}
