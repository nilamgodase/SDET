/******************************************************************************
 *  Compilation:  javac -d bi  Gambler.java
 *  Execution:    java -cp bin com.Bridgelabz.util
 *  
 *  Purpose: Gambler
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
	import java.util.Scanner;

	class Gambler {
		

	

			public static void main(String[] args) throws NumberFormatException, IOException {
				//create the variable to take the input from user 
				int choice = 0;
				
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
				System.out.println("We are going to play Gambling!");
				System.out.println("The rules are simple");
				System.out.println("You start with x$ stake and a goal of y$");
				System.out.println("Until you are broke you can keep on betting!");
				System.out.println("What are you waiting for? Let's rumble");
				do{
				System.out.println("Enter the beggining stake");
				
					
				int stake = Integer.parseInt(br.readLine());
				while(stake < 1)
				{
					System.out.println("Hey you can't start empty handed!");
					System.out.println("Please enter an amount greater than 0");
					stake = Integer.parseInt(br.readLine());
				}
				System.out.println("Enter you goal to be a millionare!");
				int goal = Integer.parseInt(br.readLine());
				while( goal < stake)
				{
					System.out.println("Dear to be millionare, your here to win! So enter an amount greater than your stake!");
					goal = Integer.parseInt(br.readLine());
				}
				Utility.gamble(stake, goal);
				System.out.println("press 1 for continue");
				choice = scanner.nextInt();
				}while(choice == 1);

			}
}