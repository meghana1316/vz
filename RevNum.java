import java.util.Scanner;
public class RevNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0, rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+num;
			System.out.println(rev);
		}
	}
}