package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		//array: to store similar data type in a array variable
		
		//lowest bound/index=0
		//upper bound/index= n-1 size of array
		//one dim array
		
		//dis-advantages of array:
		//1. size is fixed--static array-- to overcome this problem, we use Collections-- ArrayList, HashTable--Dynamic array 
		//2. stores only similar data types--to overcome this problem, we use object array
		
		
		
		//1. int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayOutOfBoundsException
		
		System.out.println(i.length); //size/length of array
		
		//print all the values of array:use for loop
		
		for(int j= 0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		//2. double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d.length);
		
		for(int e=0; e<d.length; e++) {
			System.out.println(d[e]);
		}
		
		
		//3. char array
		
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '2';
		c[2] = '$';
		
		for(int c1=0; c1<c.length; c1++) {
			System.out.println(c[c1]);
		}
				
		//4. boolean array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		
		//5.string array
		
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "hello";
		s[2] = "world";
		
		System.out.println(s.length);
		
		for(int s1=0; s1<s.length; s1++) {
			System.out.println(s[s1]);
		}
		
		
		//6. object array (object is a class)-- is used to store different data types values
		
		Object ob[] = new Object[6];
		ob[0] = "tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1.12.1998";
		ob[4] = 'M';
		ob[5] = "London";
		
		for(int ob1=0; ob1<ob.length; ob1++ ) {
			System.out.println(ob[ob1]);
			
		}
		
		System.out.println("****");
		
		for(int ob2=5; ob2>=0; ob2--) {
			System.out.println(ob[ob2]);
		}
		
		

	}

}
