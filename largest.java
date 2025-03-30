public class LARGEST {
	void large(int a,int b,int c)
	{
		if (a>b && a >c) 
			System.out.println("The largest number  is:"+a);
		else if(b>c)
			System.out.println("The largest number is:"+b);
		else 
			System.out.println("The largest number is:"+c);
	}
		public static void main(String[] args)
		{
		LARGEST L1=new LARGEST();
		System.out.println("Enter Three values:");
		Scanner S1=new Scanner(System.in);
		int a=S1.nextInt();
		int b=S1.nextInt();
		int c=S1.nextInt();
		L1.large(a, b, c);
		}
}
