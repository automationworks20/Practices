package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		//++
		//--
		
		int i = 1; //2
		int j = i++; //1 //post increment 
		//(give value of i to j and then increase the value of i by 1)
		
		System.out.println(i);
		System.out.println(j);
		
		
		
		int a = 1; //2
		int b = ++a; //2 //pre increment 
		//(increase the value of a by 1 first, give that to b. increased value of a is given to a)
		
		System.out.println(a);
		System.out.println(b);
	
	
		int m = 2; //1
		int n = m--; //2 //post decrement
		//(give value of m to n and then decrease the value of m by 1)
		
		System.out.println(m);
		System.out.println(n);
		
		
		int p = 2; //1
		int q = --p; //1 //pre decrement
		//(decrease value of p by 1 then give to q, and keep the value for p)
		
		System.out.println(p);
		System.out.println(q);
	
	
	}
	
	
	

}
