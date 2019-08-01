
/******************************************************************************
 *  Compilation:  javac -d bi  Darray.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: 2D array
 *
 *  @author  Nilam Godase
 *  @version 1.0
 *  @since   25-02-2019
 *
 ******************************************************************************/



package Functional;
public class Darray
	{
		public static void main(String[] args) 
		{

				int choice = 0;
				do {

					Utility utility = new Utility();
					System.out.println("Enter number of rows: ");
					int m = utility.inputInteger();
					System.out.println("Enter number of columns: ");
					int n = utility.inputInteger();

					// calling methods
					int[][] array1 = Utility.arrayInt(m, n);
					double[][] array2 = Utility.arrayDouble(m, n);
					String[][] array3 = Utility.arrayBoolean(m, n);

					// calling display method
					Utility.display(array1, array2, array3, m, n);
					System.out.println("Press 1 to continue");
					choice = utility.inputInteger();
				} while (choice == 1);

			}

}