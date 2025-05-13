package Assignment_3;

public class Q13_ArmstrongNo1_1000 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i+" ");
			}
			
		}
		
	}
	
	public static boolean isArmstrong(int num) 
	{
		int originalNum=num;
		int sum=0;
		int n=String.valueOf(num).length();
		
		while(num>0)
		{
			int rem=num%10;
			sum+=Math.pow(rem, n);
			num/=10;
		}
		
		return sum==originalNum;
	}
}
