import java.util.Scanner;
class Strongnum_range
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (int num=1;num<=100;num++)
		{
			int dup=num;
			int sum=0;
			int fact=1;
			while (dup>0)
			{
				int dig=dup%10;
				sum=fact(dig);
				n=dup/10;
			}
			if (sum==num)
			{
				System.out.println(num);
			}
		}
	}
}