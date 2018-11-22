//To print the sum of two numbers without using + operator.

import java.util.Scanner;

class Session1Prg1
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();

		while(y != 0)
		{
            	int carry = x & y;
            	x = x ^ y;
            	y = carry << 1;
        	}
	System.out.println("The sum of these numbers = " +x);
	}
}