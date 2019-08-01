
/******************************************************************************
 *  Compilation:  javac -d bi  PowerOftwo.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/


package Functional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PowerOftwo 
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Let's play with the power of 2");
		System.out.println("Enter the powers upto which you want to play ( -31 < n < 31)");

		int n = Integer.parseInt(br.readLine());
		while (!(n < -31) && (n > 31))
		{
			System.out.println("Please enter a no between the specified range");
			n = Integer.parseInt(br.readLine());
		}
		Utility.powerOfTwo(n);
	
	}
}