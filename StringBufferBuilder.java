//STRING BUILDER AND STRING BUFFER CLASSES AND METHODS 
class StringBufferBuilder
{
	public static void main(String[] args)
	{
		//string buffer class using new keyword
		StringBuffer sb=new StringBuffer("Priyanka");
		StringBuffer sb1=new StringBuffer("priyanka");
		
	    StringBuilder sb2=new StringBuilder("R");
		StringBuilder sb3=new StringBuilder("Priyanka");
		
		System.out.println("THE BELOW METHODS ARE STRING BUFFER CLASS METHODS");
		//in string buffer equals method checkig referrence
        System.out.println("Equals method:"   +sb.equals(sb1));
		//using append method adding atlast in the string
		System.out.println("Append method:"  +sb1.append("R"));
		//insert method using inserting new string to old one
		System.out.println("inserting string:"  +sb2.insert(0,"Priyanka"));
		//delete the characters
		System.out.println("Delete the character:"   +sb3.delete(3,6));
		//reverse the string
		System.out.println("reverse string:"  +sb3.reverse());
	}
}