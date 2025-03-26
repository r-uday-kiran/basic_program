import java.util.Scanner;
class Ascii_upperlower 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a =sc.nextInt();
		char ch =(char)a;
		System.out.println("The character of given Ascii value is : "+ch);
		if((ch>='A')&&(ch<='Z'))
		{
			System.out.println(ch+ " is an upper case");
		}
		else
		{
			System.out.println(ch+ " is a lower case");
		}
	}
}
