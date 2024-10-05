import java.util.Scanner;
class array2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// datatype arr_name[]=new datatype[size];
		int numbers[]=new int[5];
		// i0       i4
		
		for(int i=0; i<=5;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("=====================");
		for (int i=0;i<=5;i++)
		{
			System.out.println(numbers[i]);
		}
			
	}
}