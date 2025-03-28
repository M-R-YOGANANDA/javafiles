import java.util.Scanner;
public class EVENODD 
{
		public static void main(String[] args)
		{
			EVENODD L1=new EVENODD();
			//User Input 
			System.out.println("Enter the value:");
			Scanner S1=new Scanner(System.in);
			int a=S1.nextInt();
			int b= a%2;
			if(b==0) 
				System.out.println("The given number is even");
			else
				System.out.println("The given number is odd");
		}
}
