import java.util.Scanner;
class Evenodd_Ascii
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		int a = (int)ch;
		System.out.println("The Ascii value of "+ch+" is : "+a);
		if(a%2==0)
		{
			System.out.println(a+ " is even number ");
		}
		else
		{
			System.out.println(a+ " is odd number ");
		}
	}
}