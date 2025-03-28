public class constructor{
	String name="LISHA";
	int age=25;
	///DEFAULT CONSTRUCTOR
	CONSTRUCT()
	{
		System.out.println(" DEFAULT CONSTRUCTOR IS CALLED");
	}
	// PARAMETARISED CONSTRUCTOR WITH SINGLE ARGUMENT
	CONSTRUCT(String name)
	{
		this.name=name;
	}
	// PARAMETARISED CONSTRUCTOR WITH TWO ARGUMENTS
	CONSTRUCT(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	// COPY CONSTRUCTOR 
	CONSTRUCT(CONSTRUCT C)
	{
		this.name=C.name;
		this.age=C.age;
	}
	public static void main(String args[])
     {
	System.out.println("*******DEFAULT CONSTRUCTOR*************");
	CONSTRUCT DEF=new CONSTRUCT();
	CONSTRUCT PAR=new CONSTRUCT("DEEPA");
	CONSTRUCT PAR1=new CONSTRUCT("AVINASH",18);
	CONSTRUCT PAR2=new CONSTRUCT("ROOPA",28);
	CONSTRUCT COPY1=new CONSTRUCT(PAR2);
     }
}
