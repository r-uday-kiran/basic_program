import java.util.Scanner;
class Factorsprosum_evenodd
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int pro=1;
		int sum=0;
		for (int i = 1; i <= num; i++)
		{
		if (num%i==0)
		{
			if (i%2==0)
			{
				pro=pro*i;
			}
		 else
		 {
			sum=sum+i;
		 }
		}
		}
		System.out.println("The even factors product of "+num+" is : "+pro);
		System.out.println("The odd factors sum of "+num+" is : "+sum);
	}
}
