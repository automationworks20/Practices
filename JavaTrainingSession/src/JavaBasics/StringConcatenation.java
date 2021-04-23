package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//+ is concatenation operator
		//left to right execution
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 10.33;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		//a+b wont be 300 here it will be 100200
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("HelloWorld");
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is:"+b);
		System.out.println("The addition of a and b is "+(a+b));

		
		
		System.out.print("Hello Dev");
		System.out.println("Whats up");
		//ln means new line in console, if u do it without ln it will be continued in same line
		
		
		
	}

}
