class p10
{
	public static void main(String args[])
	{
		System.out.println("A");
		if(true && true && false)
		{
			System.out.println("D");
		}
		else
		{
			if(true || false)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("c");
			}
		}
	}
}