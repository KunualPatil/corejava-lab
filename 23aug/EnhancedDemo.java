/*
	Program: Program to print elements of an a anonymous array using enhanced for loop 
	@author: Kunal Patil
	@Date  : 23 Aug 2022
*/


// Creating a class named EnhancedForLoop
class EnhancedForLoop{
	
	//Creating method for printing colors
	static void printColors(String colors []){
		
		// Printing colors from the provided array using enhanced for loop
		for(String color:colors){
			System.out.println(color);		
		}
	}
	
	// Calling the main method 
	public static void main(String args []){
		
		// calling the printColors method and passing a anonymous array as a argument 
		printColors(new String[]{"red","blue","green","yellow","black"});
	}
}