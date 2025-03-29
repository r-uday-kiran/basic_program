class Evenodd 
{
	public static void main(String[]args) 
	{
		int a =2;
		int b =4;
		int c =(a+b);
		int d =(a*b);
		String result=(c%2==0)? "is even" : "is odd";
		String result1=(d%2==0)? "is even" : "is odd";
		System.out.println(result);
        System.out.println(result1);
	}
}
