class factor2numbers
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=20;
		int c=30;
		boolean check1 =(b%a==0);
		boolean check2 =(c%a==0);
		boolean result =(check1||check2);
		System.out.println("The given number "+a+" is a factor of "+b+" and "+c+" : "+result);
	}
}
