/*
	Program: Program to print the following pattern
		 1
		 12
		 123
		 1234
		 12345	
	@author: kunal patil
	@Date  : 23 Aug 2022 
*/


class printNumber
{
   static void printNums()
     {
       int i, j,num;
	   // printing number vertically
       for(i=0; i<5; i++) 
       {
        num=1;
		// printing number horizontaly
        for(j=0; j<=i; j++)  
        {
         // printing num 
         System.out.print(num+ " ");
         num++;
        }

        // ending line
         System.out.println();
       }
     
	 }
	 
	 
     //calling the main method 
     public static void main(String...args)
         {
			// calling printing number 
            printNums();
         }

}