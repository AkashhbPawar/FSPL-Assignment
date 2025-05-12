package Assignment_3;

public class Q8_reverseNo 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("reverse number is "+sum);
		
	}

}
