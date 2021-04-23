package JavaBasics;

public class PyramidPractice {

	public static void main(String[] args) {
		
		//to print right angle triangle with star pattern
		
		
		for(int r= 0; r<=4; r++) { //5 rows 
			for(int c=0; c<=r; c++) { //inner for loop will keep printing * till the condition is satisfied
				System.out.print("* ");
			}
			System.out.println(); //when the condition is not satisfied it will exit the loop and go to new line
		}
		
		
		//to print a reverse right angle triangle with star pattern
		
		
		for(int row=0; row<=4; row++) { 
			for(int col=4; col>=row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
