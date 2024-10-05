import java.util.Scanner;
class table
{
	public static void main(String[] args)
	{
		int num;
		System.out.print("Enter any Number");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();//nextInt is used to print integer value
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"+"+i+"="+num*i);
		}
	}
}