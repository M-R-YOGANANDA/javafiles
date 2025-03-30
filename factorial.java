import java.util.Scanner;
class factorial
{
       public static void main(String args[])
      {
        System.out.println("Enter the number");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int fact=1,i=1;
       while(i<=n)		
         {
             fact=fact*i;
             i++;
          }
      System.out.println("The factorial of a given number is: "+fact);
      }
}
