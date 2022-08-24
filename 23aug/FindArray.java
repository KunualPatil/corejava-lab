/*
	Program: 
	@author: kunal patil
	@Date  : 23 Aug 2022
*/

class findNum
{
	// main method
	static void findNumber(int fNum)
	{
		// provided Array
		int arr[]={34,6,-7,12,54};
		
		// set isPresent in the array to false 
		boolean flag =false;
		
		// traversing the array
		
		for ( int i=1; i<=arr.length;i++)
		{
			// if the array element is equal to the number
			if(fNum==arr[i])
			{
				// print the element and its index
				System.out.println("The number "+fNum+" is present at index. "+ i);	
				// set flag to true 
				flag=true;
				break;
				// Come out of the loop
			}
			
			
		}
	    
		if(flag==true)
		System.out.println("the number "+ fNum + "is present in the Array");
		else
		System.out.println("the number "+ fNum + "is notpresent in the Array");
			
	}
	//calling main method
	public static void main(String args[])
	{
		// calling findnumber method and passing a argument
		findNumber(Integer.parseInt(args[0])); // calling findnumber method
	}	
}