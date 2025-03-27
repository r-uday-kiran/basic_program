class Upper  
{
	public static void main(String[] args) 
	{
		char a ='c';
		String result = ((a>='A')&&(a<='Z'))? " is an upper case": "is not an upper case";
		System.out.println(a+result);
	}
}
