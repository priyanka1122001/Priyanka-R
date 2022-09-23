// wrp to types of variables
//P CG 2576
class VariableTypes
{
	int a=10;//instance variable		
	
	static int b=20;//static variable	
	
	public int m1()
	{
		int c = 25;//local variable	
		
		System.out.println("c="+c);
		
		return 0;
		
	}
	public static void main(String[]args)
	{
		VariableTypes variable= new VariableTypes();
		
		System.out.println("a="+variable.a+" "+b);
		
		variable.m1();
	}
}