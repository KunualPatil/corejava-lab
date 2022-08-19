/*Lab session
@program:Java programto print the tagline of the brand entered(take any 5 brands)
@author:Kunal Patil
@date:-18 aug 2022
*/

class BrandTagline
{
	//creating static method
	static void printTagline()
	{

		String brand="realme";
		switch (brand)    //(Tagline); //using switch case
		{
			//using different cases in switch case
			case "realme" :  
		
				System.out.println("because you are worth it");	
			break;
			case "vivo":
				System.out.println("think different");                   
			break;
			case "oppo":
				System.out.println("because you are worth it");
			break;
			case "microsoft": 
				System.out.println("open happiness");
			break;
			case "videocon":
			System.out.println("I'm  loving it");
			break;
			//default value if conditions are not met
		default: System.out.println("only valid for - realme, vivo,oppo,microsoft,videocon");
		}
	}
	
public static void main(String args[])
{
	//for input of brand name and then printing it's tagline 
	printTagline(); //calling static mehtod
}
}