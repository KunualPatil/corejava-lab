/*
Program:Write a Java program to print the duplicate entries , Sort the array and then remove the duplicate entry.
author: Kunal Patil
Date: 21sept2022
*/

// declaring a class
class InsertArray
{
    
   
   static void insert(int ar[], int num, int pos)
   {	  
         int size= ar.length;
		 int i;
	     int myArray[] = new int[size+1];
		 
		 for(i=0;i<pos-1;i++)
		 {
			 myArray[i]= ar[i];
		 }
		 
		 myArray[pos-1]=num;
		 
		 for(i=pos;i<size+1;i++)
		 {
			 myArray[i]= ar[i-1];
		 }
	   
	    System.out.print("Array after insert:" );
		displayArray(myArray);
	   
	   
   }
  
   static void displayArray(int ar[])
   {
	  for(int i:ar) 
	  {
		  System.out.print(i+ "  ");
		  
	  }
    
	   
   }
   