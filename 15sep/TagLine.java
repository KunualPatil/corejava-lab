/*
	Program: Print tag line of a brand
	@author: Kunal Patil
	@Date  : 18 Aug 2022
*/

// Declaring a class named TaglinePrinter
class TagLine
{	
	// Creating a method PrintTaglineOf
	static void printTagline(String brand)
	{
		
		// Switch case start 
		switch(brand)
		{
			
			// if the case is Adidas
			case "Adidas" ->System.out.println("Adidas ---> \"Just do it\" ."); 
			// if the case is Nike 
			case "Nike" ->System.out.println("Nike ---> \"Impossible is nothing\" .");
			// if the case is puma 
			case "puma" ->System.out.println("Puma - \"forever faster is first ,never second, never third\" ."); 
			// if the case is Bata 
			case "Bata" ->System.out.println("Bata ---> \"Step out and play\" ."); 
			// if the case is Reebok
			case "Reebok" ->System.out.println("Reebok ---> \"Keep going\" ."); 
			// if the case is not found
			default ->System.out.println("We don't have such a brand ."); 
		
		// Switch case end
		}
		
		
	}
	
	// Calling the main method
	public static void main(String args[])
	{	
		String brandName=args[0];
		// Calling the tag line printer method
		printTagline(brandName.toLowerCase());			
		
	}
}