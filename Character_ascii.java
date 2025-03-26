import java.util.Scanner;
class Character_ascii 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		int a = (int)ch;
		System.out.println("The Ascii value of "+ch+" is : "+a);
	}
}
