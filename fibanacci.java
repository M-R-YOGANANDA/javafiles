import java.util.Scanner;
public class fibanacci{
    public static void main (String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of n to find the fibanacci of n numbers");
        int num=scan.nextInt();
        int fib=0;
        for (int i=0;i<=num;i++){
            fib=fib+i;
        }
        System.out.println("fibanacci of"+num+"is"+fib);
    }

}
