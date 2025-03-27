import java.util.Scanner;
class Upper_check
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet : ");
		char ch = sc.next().charAt(0);
		if (ch>='A'&&ch<='Z')
		{
			System.out.println(ch+" is an upper case alphabet");
		}
		else
		{
			System.out.println(ch+" is not an upper case alphabet");
		}
	}
}
