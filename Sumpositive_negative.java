import java.util.Scanner;
class Sumpositive_negative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = (a+b);
		if(sum>0)
		{
			System.out.println(sum+" is positive");
		}
		else if(sum<0)
		{
			System.out.println(sum+" is negative");
		}
		else
		{
			System.out.println("The sum two numbers is zero which is neutral");
		}
	}
}
