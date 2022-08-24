/*
	Program: Array demo
	@author: kunal patil
	@Date  : 22 Aug 2022
*/

class ArrayDemo
{
	//passing value of Array
	static void printArray(int num1, int num2, int num3)
	 
	 {
		 //int myArray[];
	     // myArray=new int [3]
		 
		 int myArray[]=new int [3];  
		 
		 myArray[0]=num1;
		 myArray[1]=num2;
		 myArray[2]=num3;
		 
		 for (int i=0; i<myArray.length;i++)
		 {
			 System.out.println("Element"+(i+1)+ ":" +myArray[i]);
			 // printing the element of Array
		 }
		 
	 }
	 
	 public static void main( String args[])
	 {
		 printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		  
		  
	 }
		 
}	 