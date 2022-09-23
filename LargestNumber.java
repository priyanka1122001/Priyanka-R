// wrp to types of variables
//Priyanka R  CG 2576
class VariableTypes
{
	int a=20;//instance variable		
	
	static int b=30;//static variable	
	
	public int m1()
	{
		int c = 35;//local variable	
		
		System.out.println(c+" "+c);
		
		return 0;
		
	}
	public static void main(String[] args)
	{
		VariableTypes variable= new VariableTypes();
		
		System.out.println("a="+variable.a+" "+b);
		
		variable.m1();
	}
}