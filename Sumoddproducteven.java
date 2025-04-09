class Sumoddproducteven 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int product=1;
		for (int i=1;i<=10;i++);
		{
        if (i%2==0) 
		{
			product=product*i;
        } 
		System.out.println("Product of even numbers from 1 to 10: " + product);
		else 
		{
			sum=sum+i;
		}
		System.out.println("Sum of odd numbers from 1 to 10: " + sum);
		}
		
	}
}
