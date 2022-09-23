//wrp to demo pattern program
//Priyanka R CG BATCH 2576
class Pattern
{ 
public static void main(String[] args)
{
int j, rows=6,column=3;
for(int i=rows-1;i>0;i--)
{
for(j=1;j<=i;j++)
{
System.out.println("*" +" ");
}
System.out.println();
}
}
}