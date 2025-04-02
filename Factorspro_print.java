import java.util.Scanner;
class Factorspro_print
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int pro =1;
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				pro=pro*i;
			}
		}
		System.out.println("The product of factors of "+num+" is : "+pro);
	}
}
