import java.util.Scanner;
public class MarkList
{
	public static void main(String[] args)
	{
		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter No of Students : ");
		int num = scan.nextInt();
		System.out.println("---------------------------------------------------------");
		for(int i =1; i<=num; i++)
		{
		System.out.print("Enter Mark for Student "+count+" : ");
		int mark = scan.nextInt();
		if(mark>=90 && mark<=100)
		{
			System.out.println("Grade Secured - 'A'");
		}
		else if(mark>=80 && mark<=90)
		{
			System.out.println("Grade Secured - 'B'");
		}
		else if(mark>=70 && mark<=80)
		{
			System.out.println("Grade Secured - 'C'");
		}
		else if(mark>=60 && mark<=70)
		{
			System.out.println("Grade Secured - 'D'");
		}
		else
		{
			System.out.println("Grade Secured - 'F'");
		}
		System.out.println("---------------------------------------------------------");
		count++;
		}
		System.out.println("");
	}
}