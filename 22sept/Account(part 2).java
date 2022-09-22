/*
Program:Write a  java program to create a BankAccount and display the people with balance less than 1000. (part 1)
author: Kunal Patil
Date: 21sept2022
*/

//declaring a class Account

class Account
{
	//declaring of account
	
	private int accID;
	private String accName;
	private int accbalance;
	
	// no arg constructor
    Account(){}
	
	//parameterized constructor
	Account(int accID,String accName,int accbalance)
	{
		this.accID=accID;
		this.accName=accName;
		this.accbalance=accbalance;
	}
	
	//use getters and setters
	
	//get for accID
	public int getAccID()
	{
		//return accid
		return this.accID;
	}
	//set for accID
	public void setAccID(int accID)
	{
		this.accID=accID;
	}
    //get for accname
	public String getAccName()
	{
		// return for accname
		return this.accName;
	}
	//set for accname
	public void setAccName(String accName)
	{
		this.accName=accName;
	}
	//get for accbalance
	public int getaccBalance()
	{
		return this.accbalance;
	}
	//set for accbalance
	public void setaccBalance(int accbalance)
	{
		//return for accbalance
		this.accbalance=accbalance;
	}
}// Amount class end