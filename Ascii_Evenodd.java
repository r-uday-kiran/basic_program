import java.util.Scanner;
class Ascii_Evenodd  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the  first character : ");
		char ch1 = sc.next().charAt(0);
		int a =(int)ch1;
		System.out.println("Enter the second character : ");
		char ch2 = sc.next().charAt(0);
		int b =(int)ch2;
		int sum =(a+b);
		System.out.println("The sum is : "+sum);
		if(sum%2==0)
		{
			System.out.println(sum+ " is even ");
		}
		else
		{
			System.out.println(sum+ " is odd ");
		}
	}
}
