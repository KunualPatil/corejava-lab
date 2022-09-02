/*
	Program : Write a program that reads a set of integers, and then prints the sum 
		  of the even and odd integers.(using arrays)  
	@author : Kunal Patil
	@date : 1 Sep 2022
*/

// import all the methods from system class 
import static java.lang.System.*;

// Creating a class named Integer Array
class evenoddArray{
	
	// Creating a method to add and odd numbers in an array
	static void evenOddSum(String...arr){
		// creating oddNum variable for sum of odd variables
		int oddNum=0;
		// creating evebNum variable for sum of even variables
		int evenNum=0;
		
		
		for(String i:arr){
			// converting the value of arr into integer from String and storing into integerElement variable
			int integerElement=Integer.parseInt(i);
			
			// if even
			if(integerElement%2==0){
				// add integerElement into eveNum
				evenNum+=integerElement;
			}
			//if odd 
			else{
				// add integerElement into oddNum
				oddNum+=integerElement;
			}
		} // for loop ends
		
		// print the sum of odd and even numbers in an array
		out.println("The sum of even numbers from the array is : "+evenNum);
		out.println("The sum of odd numbers from the array is : "+oddNum);
		
	} 

	// calling main method
	public static void main(String...args)
	{	
		// calling evenOddSum method and passing args as argument 
		evenOddSum(args);
	}	
}