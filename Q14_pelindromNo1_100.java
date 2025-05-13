package Assignment_3;

public class Q14_pelindromNo1_100 
{
	public static void main(String[] args) 
	{
		System.out.println("print 1 to 100 pelindrome number");
		for(int i=1;i<=100;i++)
		{
			int n=i;
			int sum=0;
			
			while(n>0)
			{
				int rem=n%10;
				sum=sum*10+rem;
				n=n/10;
			}
			
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			
		}
		
	}

}
