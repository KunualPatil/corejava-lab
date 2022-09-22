/*
Program : Write a  java program to create a BankAccount and display the people with balance less than 1000. (part 2)
@author: Kunal patil
@Date : 21 sep 2022
*/

//declaring class Bank

class statebank
{
	//main method
	public static void main(String...args){
		// Creating array 
		Account bank1[]=new Account[10];
		
		// Constructor injection
		bank1[0]=new Account(1,"kunal",80000);
		bank1[1]=new Account(2,"Samiksha",70000);
		bank1[2]=new Account(3,"tanya",10000);
		bank1[3]=new Account(4,"tejal",500);
		bank1[4]=new Account(5,"mitali",3000);
		bank1[5]=new Account(6,"sneha",7000);
		bank1[6]=new Account(7,"nishant",800);
		bank1[7]=new Account(8,"amol",400);
		bank1[8]=new Account(9,"pratham",100);
		bank1[9]=new Account(10,"harsh",100);
		
		
		for(int i=0;i<bank1.length;i++){
			
			int amount=bank1[i].getaccBalance();
		
			if(amount<1000){
				
				System.out.println("\n------- Account "+i+" Detsils -------");
				System.out.println("The account id is : "+bank1[i].getAccId());
				System.out.println("The account holder name is : "+bank1[i].getAccName());
				System.out.println("The account balance is : "+bank1[i].getAccBalance());
			}  
			
		} // for loop ends
		
	} 
	
}// Bank class ends  