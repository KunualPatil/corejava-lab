/*
	Program: Java progam to find the largest and second largest number in an array .
	@author: kunal patil
	@Date  : 25 Aug 2022
*/

import static java.lang.System.*;

class SizeNum
{
	
	// Creating printSizeNum method
	static void printSizeNum(String...arr)
	{
		// Storing the size of arr 
		int size=arr.length;
		// Creating a new array
		int newArr []=new int[size];

		for(int i=0;i<size;i++){
			newArr[i]=Integer.parseInt(arr[i]);	
		}
		
		// Printing the provided array 
		out.print("The provided array is :");
		for(int i:newArr){
			out.print(i+" ");
		}
		
		// calling sortArray and passing newArr as argument
		sortArray(newArr);

	}

	// Creating a class named printPattern
	static void sortArray(int...arr)
	
	{
	   int len= arr.length;
	   System.out.println("The size of the array is :"+len);
		int temp;
	   // sorting the array in ascending order
	   
	   for(int j=0;j<len;j++)
	   {
		   for(int k=j+1;k<len;k++)
		   {
			   if(arr[j]>arr[k])
			   {
				   temp=arr[j];
				   arr[j]=arr[k];
				   arr[k]=temp;
			   }
				// closing the if check
				
			} //closing the j loop
			
		} // clossing the i loop

		
		out.println();
		// Printing the largest and second largest namber	
		
		out.println("The second largest number is : "+ arr[arr.length-2]);	
		out.println("The largest number is : "+ arr[arr.length-1]);
		
	}

	// calling main method
	 public static void main(String ...arg)
    {
		// take input from the command line argument
		
		// calling printSizeNum method and passing args as argument 
		printSizeNum();
	}
}
 