import java.util.Scanner;
class Ascii_character 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a =sc.nextInt();
		char ch =(char)a;
		System.out.println("The character of given Ascii value is : "+ch);
	}
}
