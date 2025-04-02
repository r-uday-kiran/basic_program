class Factorsprosum_equal
{
	public static void main(String[] args) 
	{
		int pro =1;
		int sum=0;
		for (int i=1;i<=3;i++)
		{
			if (i%2==0)
			{
				pro=pro*i;
				sum=sum+i;
			}
		}
		System.out.println("The product of factors of is : "+pro);
		System.out.println("The sum of factors of is : "+sum);
		if (sum==pro)
		{
			System.out.println("The sum and product are equal");
		}
		else
		{
			System.out.println("The sum and product are not equal");
		}
	}
}
