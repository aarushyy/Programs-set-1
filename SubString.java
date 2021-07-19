import java.util.Scanner;
public class SubString
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the statement: ");
	String s = scan.nextLine();
	String a = s.substring(5);
	System.out.println("Thesubstring starting from 5: "+a);
	}
}
	