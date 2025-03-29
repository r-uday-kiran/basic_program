import java.util.Scanner;
class Factor1_check
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		if(50%a==0)
		{
			System.out.println(a+" is a factor of 50");
		}
		else
		{
			System.out.println(a+" is not a factor of 50");
		}
	}
}
