import java.io.*;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("A Program to perform basic Mathematical Operations\n");
		int a,b,sum=0,diff=0;
		System.out.println("Enter 2 numbers\n");
		System.out.println("Enter the first number :- ");
		a = sc.nextInt();
		System.out.println("Enter the second number :- ");
		b = sc.nextInt();
		System.out.println("Sum = " + (a+b));
	}
}