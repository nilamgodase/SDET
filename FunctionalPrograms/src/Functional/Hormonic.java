
/******************************************************************************
 *  Compilation:  javac -d bi  Hormonic.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N .
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/

package Functional;
public class Hormonic
{
public static void main(String args[])
{
int choice = 0;
do
{			
	Utility utility = new Utility();
	System.out.println("Enter N upto which the Harmonic no is to be calculated.");				
	int n =utility.inputInteger();
	Utility.harmonicGenerator(n);
    System.out.println("press 1 for continue");
	choice = utility.inputInteger();
					
   }	while(choice == 1);
}
}