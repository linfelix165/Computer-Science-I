import java.util.Scanner;

public class FactorialApproximation {
	public static void main(String[] args){
	    final double PI = 3.14159;
	    final double E = 2.718281;
	    int n;
	    double finalValue;
	    int actualValue;
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("\tFactorial Approximation");
	    System.out.println("Please enter a value between 1 to 100 :"); //Ask user to input a number
	    n = input.nextInt();
	    
	    if(n >=1 && n <= 100){ // Use if-else statement to make sure the range of n
            
            // Stirling's Approximation for n!
            finalValue = Math.sqrt(2.0) * Math.sqrt(PI) * Math.pow((1/E),n) * Math.pow(n, n+0.5);
	    	System.out.println("The approximation of "+n+"! is "+finalValue);
	    	
	    	if(n == 5){ // If n = 5, the program will compare actual value and calculated value
	    		actualValue = 5*4*3*2*1;
	    		System.out.println("Actual value: "+ actualValue);
	    		System.out.println("Calculated value: "+finalValue);
	    	}
	    	else if(n == 7){ // If n = 7, the program will compare actual value and calculated value
	    		actualValue = 7*6*5*4*3*2*1;
	    		System.out.println("Actual value: "+ actualValue);
	    		System.out.println("Calculated value: "+finalValue);
	    	}
	    	
	    }else{ // If the input value outside the range, program will display
	    	System.out.println("You must enter a vailed number!");
	    }
	    
	    System.out.println("Created by Ho Chien, Lin");
	}
}
