public class CONSTRUCT {
	String name="LISHA";
	int age=25;
	CONSTRUCT()
	{
		System.out.println(" DEFAULT CONSTRUCTOR IS CALLED");
	}

	CONSTRUCT(String name)
	{
		this.name=name;
	}

	CONSTRUCT(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

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
	System.out.println("Student name:"+DEF.name+" and age:"+DEF.age);
	System.out.println("*******PARAMETARISED CONSTRUCTOR WITH SINGLE ARGUMENT*********");
	System.out.println("Student name:"+PAR.name+" and age:"+PAR.age);
	System.out.println("*******PARAMETARISED CONSTRUCTOR WITH TWO ARGUMENTS*********");
	System.out.println("Student name:"+PAR1.name+" and age:"+PAR1.age);
	System.out.println("Student name:"+PAR2.name+" and age:"+PAR2.age);
	System.out.println("*******COPY CONSTRUCTOR*************");
	System.out.println("Student name:"+COPY1.name+" and age:"+COPY1.age);
	
 }
}
