/*
	Program : Java program to print a pattern 		
			   *		
		      * *		
		     * * *		
		    * * * *		
	@author : Kunal Patil
	@date : 15 Sep  2022
*/

// import scanner class
import java.util.Scanner;

// import all methods from System class
import static java.lang.System.*;

// Creating a PrintPattern class
class PrintPattern
{   
	// Creating a class named printPaattern
	static void printPaattern()
	{
		// Creating a new Scanner object	
		Scanner sc=new Scanner(System.in);
		
		// taking input
		out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		
		// for loop of rows 
		for(int i=1;i<rows;i++)
		{
			// for loop for spaces on left			
			for(int j=rows;j>i;j--)
			{
				out.print(" ");	
			}
			
			// for loop for *
			for(int s=rows-i;s<rows;s++)
			{
				out.print(" * ");	
			}
			
			// for loop for spaces on right		
			for(int l=rows;l>i;l--)
			{
				out.print(" ");	
			}
			
			// next line
			out.println("");
		} // for loop of rows ends
		
	}

	// Calling main method
	public static void main(String...args)
	{
		// Calling printStarPaattern method
		printPaattern();
	}
}