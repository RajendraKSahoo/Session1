//To print the result of the expression

class Session1Prg2
{
	public static void main(String s[])
	{
	int a = 20;
	int b = 10;
	int c = a--;
	int d = a >> 2;
	int e = a & b;
	b = a-- - --a;
	System.out.println("The value of expression 'b' is: " +b);
	System.out.println("The value of expression 'c' is: " +c);
	System.out.println("The value of expression 'd' is: " +d);
	System.out.println("The value of expression 'e' is: " +e);
	}
}

/*
int b = a-- - --a;
int c = a--;
int d = a>>2;
int e = a&b;
*/