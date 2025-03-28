class Digit 
{
	public static void main(String[] args) 
	{
		char a ='3';
		String result =((a>='0')&&(a<='9'))? "is a digit" : "is not a digit";
		System.out.println(a+result);
	}
}
