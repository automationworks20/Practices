package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		
		//print the first 10 integers
		
		
		//1. while loop:
		//disadvantage of while loop: it will generate infinite loop if you dont give incremental or decremental part
		
		int i = 1; //initialization
		while(i<=10) { //conditional part
			System.out.println(i);
			i=i+1; //incremental-decremental 
		}
	    System.out.println("*****");
		
		//j++ means j+1
	    //j-- means j-1
		
		
		//2. for loop:
	
	    for(int j=1; j<=10; j++) { //initialization, Conditional, Incremental 
		     System.out.println(j);
	     }
	    
	    
	    System.out.println("****");
	    
	    
	    
	  //print 10-1
	    for(int k=10; k>=1; k--) { //initialization, Conditional, Decremental
	    	System.out.println(k);
	    }
	    
	    
		
		
		
		
		
		
	}

}
