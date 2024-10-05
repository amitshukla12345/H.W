import java.util.Scanner;
class evenhw
{
	public static void main(String[]args)
	{
		int n;
		System.out.print("Enter any Number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.print("Even number");
		}
		else
		{
			System.out.print("odd Number");
		}
	}
}