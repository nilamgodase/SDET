/******************************************************************************
 *  Compilation:  javac -d bi  Coupon.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Generate coupon number
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/

package Functional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Coupon 
{
		public static void main(String[] args) throws NumberFormatException, IOException 
		{
			int choice = 0;
			do
			{
				//create the object of utility
				Utility utility = new Utility();
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Let's play with coupons");
				System.out.println("Enter the no of coupons you want to generate");
				int n = Integer.parseInt(br.readLine());
				Utility.processCoupons(n);
				System.out.println("press 1 for continue");
				choice = utility.inputInteger();

			}while(choice == 1);
		}

}