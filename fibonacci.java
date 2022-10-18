import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
	{
	
	Scanner ob=new Scanner(System.in);
int a=0 , b=1 , c=0 , limit;
	System.out.println("enter a fibonacci no");
limit = ob.nextInt();
	System.out.println(a + " \t "+ b + "\t");
    do
    {
        c=a+b;
    System.out.print(c + " \t ");
        a=b;
		b=c;
		c++;
    }
    while(c<=limit);
	}
}