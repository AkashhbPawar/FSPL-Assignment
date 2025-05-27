package Assignment_3_String;

public class Q2_countOfOvels 
{
	public static void main(String[] args) 
	{
		String str="vishalpawar";
		char[] ch=str.toCharArray();
		int countovels=0;
		int count1=0;
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				countovels++;
			}
			else
			{
				count1++;
			}
		}
		
		System.out.println("count of ovels is = "+countovels);
		System.out.println("count of consonants is = "+count1);

		
	}


}
