
/*
Program:Write a Student and create an array of 10 students and display the students whose marks are more than 90%
author: Kunal Patil
Date: 21sept2022
*/

//declaring a class Student

class Student{
	// details of a student 
	private String Name;
	private int marks;
	private int Percentage;
	
	// no argument constructor
	Student(){}
	
	// parameteried constructor
	Student(String Name,int marks,int Percentage)
	{
		
		this.Name=Name;
		this.marks=marks;
		this.Percentage=Percentage;
	}
	
	// get for Name
	public String getName()
	{
		// return Name
		return this.Name;
	}
	
	// set for Name
	public void setName(String Name )
	{
		
		this.Name=Name;
	}
	
	// get for marks
	public int getmarks()
	{
		// return marks
		return this.marks;
	}
	
	// set for marks
	public void setmarks(int marks)
	{
		
		this.marks=marks;
	}
	
	// get for Percentage
	public int getPercentage()
	{
			
		return this.Percentage;
	}	
	
	// set for Percentage
	public void setPercentage(int Percentage)
	{
		
		this.Percentage=Percentage;
	}
}// Student class ends

//Creating School class


class College
{
	//  main method
	public static void main(String...args)
	{
		// creatingnarray of 5 student
		Student[] std=new Student[5];
		
		
		std[0]=new Student("kunal",490,98);
		std[1]=new Student("Samikasha",380,78);
		std[2]=new Student("Tanya",470,94);
		
		// getter setter injection
		std[3]=new Student();
		std[3].setName("Amol");
		std[3].setmarks(390);
		std[3].setPercentage(79);
		
		// getter setter injection
		std[4]=new Student();
		std[4].setName("sanket");
		std[4].setmarks(450);
		std[4].setPercentage(90);
		
	
		for(int i=0;i<std.length;i++)
		{
	
			int per=std[i].getPercentage();
			
			if(per>=90)
			{		
				// student details
				System.out.println("\n-----------student "+i+" --------");
				System.out.println("The student id is : "+std[i].getName());
				System.out.println("The student name is : "+std[i].getmarks());
				System.out.println("The student percentage is : "+std[i].getPercentage());
			}// if ends
			
		}// for ends
		
	}
	
}// college class ends