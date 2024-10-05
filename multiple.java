class multiple
{
	public static void main(String args[])
	{
		int n=13;
		if(n%3==0)
		{
			System.out.println(n+" is multiple of 3");
			if(n%2==0)
			{
				System.out.println(n+"is even");
			}
			else
			{
				System.out.println(n+"is odd");
			}
		}
		else
		{
			System.out.println(n+"is not multiple of 3");
		}
	}
	
}