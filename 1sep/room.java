/*
	Program:  Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. 
	          In this class the member functions are setdata and displaydata.
	@author: kunal patil
	@Date  : 30 Aug 2022
*/

// import all the methods from system class 
import static java.lang.System.*;

// creating class
class Room 
{
   private int roomNo;
   private String roomType;
   private float roomArea;
   private boolean acMachine;

 void setData(int r_no, String r_t, float r_area, boolean ac_M) 
  {
   roomNo = r_no;
   roomType = r_t;
   roomArea = r_area;
   acMachine = ac_M;
  }
 void displayData()
  {
    System.out.println("The room No is" + roomNo);
    System.out.println("The room Type is" + roomType);
    System.out.println("The room area is" + roomArea);
    System.out.println("The A / c Machine needed :"+ (acMachine? "Ac room" : "NON AC room"));
  }

}

// Creating Room class
class bookRoom
{
	// Calling the main method 
	public static void main(String...args){
		// Creating a new object c1
		Room c1=new Room();
		// setting the data of c1 
		c1.setData(101,"singal",300,true);
		// getting the data of c1
		c1.displayData();
		
		out.println();
		
		// Creating a new object c2
		Room c2=new Room();
		// setting the data 
		c2.setData(201,"duplex",200,false);
		// getting the data 
		c2.displayData();
	}
}