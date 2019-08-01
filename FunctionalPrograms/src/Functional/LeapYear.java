

/******************************************************************************
 *  Compilation:  javac -d bi  LeapYear.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Print the year is a Leap Year or not.
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/


package Functional;
   
    
    public class LeapYear 

    {
    	public static void main(String[] args)
    	{
    		Utility utility = new Utility();
    		int choice = 0;
    		do{
    			System.out.println("Enter a Year : ");
    			int inputyear=utility.inputInteger();
    			boolean leap = utility.leapYear(inputyear);
    			if(leap)
    			{
    				System.out.println("Year "+inputyear+" is leap year : ");
    			}
    			else
    			{
    				System.out.println("Year "+inputyear+" is not leap year : ");
    			}
    			System.out.println("for continue press 1 ");
    			choice = utility.inputInteger();
    		}while(choice == 1);
    	}
    
}