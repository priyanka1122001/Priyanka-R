//wrp to Student details using Scanner class
// Priyanka R CG batck  2576
import java.util.Scanner;
class Students
{
	public static void main(String[]Args)
	{
		int id;
		String name;
		double att;
		System.out.println("Enter student details");
		Scanner SC=new Scanner(System.in);
		id=SC.nextInt();
		name=SC.next();
		att=SC.nextDouble();
		System.out.println("id+  "+name+" "+att);
	
	}
	}