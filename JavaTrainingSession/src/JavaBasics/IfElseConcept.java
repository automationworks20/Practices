package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		//comparison operators: <, >, <=, >=, ==(equal to), != (not equal to)
		
		int c = 40;
		int d = 90;
		
		if(c==d) {
			System.out.println("c is equal to d");
		}
		else {
			System.out.println("c is not equal to d");
		}
		
		//write a logic to find out the highest number

		int a1 = 100;
		int b1 = 700;
		int c1 = 300;
	
		//& is a logical operator
		//true & true= true
		//false & true= false
		//false & false= false
		
		
		//this is Nested IfElse condition
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
		
		
		
		
	}

}













