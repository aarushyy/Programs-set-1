import java.util.Scanner;
public class IfiniteLoop
{
	public static void main(String[] args)
	{
		IfiniteLoop obj1 = new IfiniteLoop();
		Scanner scan = new Scanner(System.in);
		System.out.println("Option 1: while Infinite loop");
		System.out.println("Option 2: For Infinite loop");
		System.out.print("Enter your choice for Infinite loop: ");
		int num = scan.nextInt();
		switch(num) {
		case 1:
		obj1.whileLoop();
		break;
		case 2:
		obj1.forLoop();
		break;
		default:
		System.out.print("Invalid option !!");
					}
		
	}
	void whileLoop()
 {
	while(true)
	{
	System.out.print("XoXoXo");
	}
 }
 void forLoop()
 {
	 for(;;)
	{
	System.out.print("X-) X-) X-)");
	}
 }
 
}