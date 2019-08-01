package Functional;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
import java.util.HashSet;
import java.util.Arrays;
import java.io.PrintWriter;
public class Utility 
{

	static Scanner scanner = new Scanner(System.in);
	static Utility utility = new Utility();
   // static HashFunction myHashMap = new HashFunction();
	static BufferedReader br;
	//constructor to initialize bufferedReader

	/*private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "27/07/2017";
*/
	public Utility()                                                  
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	//take input word
		public static String inputString()     
		{
			try{
				return br.readLine();
			}
			catch(IOException ioe)
			{
				System.out.println(ioe.getMessage());
			}
			return "";
		}                                                                                                                                  

		//Take Integer Input
		public int inputInteger(){
			try{
				try{	
					return Integer.parseInt(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0;
		}

		//Take Double Input
		public double inputDouble(){
			try{
				try{	
					return Double.parseDouble(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0.0;
		}
/*****************************FlipCoin***********************************************/


//declare variables
	static double flip;
	static int count = 0;
	static int countHeads = 0;
	static int countTails = 0;
	static int percentHeads = 0;
	static int percentTails = 0;
	
	/**
	 * @param   - integer input
	 * @returns nothing
	 */
	
	public static void flipcoin(int n)
	{

		for(int x = 0; x <=n;x = x++)
		{
			x = x + 1;
			//flip
			flip = Math.random();
			//if statement
			if( flip <= .5)
			{   
				flip = countHeads;
				countHeads = countHeads + 1;
				percentHeads = countHeads * 10;
			}
			else
			{           
				flip = countTails;
				countTails = countTails + 1;
				percentTails = countTails * 10;
				System.out.println("Heads was flipped " + percentHeads + " percent of the time.");
				System.out.println("Tails was flipped " + percentTails + " percent of the time.");


			}

			count = count +1;



		}//End Loop*/
}
	
	/**********************Leapyear*************************************/
	public boolean leapYear(int a)
	{
		if(a>1000)
		{
			if(a % 400 == 0)
			{
				return true;
			}
			else if(a % 4 == 0)
			{
				return true;
			}
			else if(a % 100== 0)
			{
				return false;
			}
			else
			{
				return false;
			}
		}
		return false;
	}	
/********************PowerOfTwo*******************************/
	public static void powerOfTwo(int n)
	{		
		int i = 0;
		int power = 1;
		System.out.println("Powers of 2 that are less than 2^"+n);
		if(n>0)
		{
			while (i <= n)
			{
				System.out.println("2^"+i+" = " + power);
				power = power * 2;
				i++;
			}
		}
		else
		{
			while (i >= n)
			{
				System.out.println("2^"+i+" = " + power);
				power = power * 2;
				i--;
			}
		}
	}

	/*
	 * Method to generate hormonic sum
	 * @param: integer number
	 * 
	 */
	/*************Harmonic generator***************************/
	public static void harmonicGenerator(int n)
	{
		double sum = 0.0;
		for(int i = 1 ; i<=n ; i++)
		{
			sum = sum + 1.0 / i;	
		}

		System.out.println("The "+n+"th Harmonic number is "+sum);
	} // end of harmonicGenerator method

/**********************Prime Factors****************************/
	/*
	 * Method to generate prime factors
	 * @param: integer number
	 */
	public static void primeFactors(int n)
	{

		while (n%2==0)
		{
			System.out.print(2 + " ");
			n /= 2;
		}

		for (int i = 3; i*i<= n; i+= 2)
		{
			while (n%i == 0)
			{
				System.out.print(i + " ");
				n /= i;
			}
		}
		System.out.println("");

		if (n > 2)
			System.out.print(n);

	}
/**********************Gambler*************************/
	/**
	 * @param input of stack and goal
	 */
	public static void gamble(int stake, int goal)
	{
		int win = 0;
		int loss = 0;
		float totalGambles = 0;
		int gamble = 0;
		Random random = new Random();
		do
		{
			gamble = random.nextInt(2);
			System.out.println(gamble);
			totalGambles++;
			if(gamble == 0)
			{
				stake++;
				System.out.println("Yay you won! You now have "+stake+". Your goal:"+goal);
				win++;
			}
			else
			{
				stake--;
				System.out.println("Bad luck!You lost! You now have "+stake+". Your goal:"+goal);
				loss++;
			}			
		}
		while(!(stake == 0 || stake == goal));

		System.out.println("You won "+win+" times");
		float winp = (win/totalGambles)*100;
		System.out.println("Win percent%"+winp);
		float lossp = (loss/totalGambles)*100;
		System.out.println("Loss percent%"+lossp);

	}
/*************************coupon*****************************/
	// Method to generate coupan code

	public static void processCoupons(int n) 
	{

		// create the necessary stuff
		Random random = new Random();

		// this is used to count to the random no's we will need
		int randomCounter = 0;

		// this is a counter for generating n no of coupons
		int couponCount = 0;

		// we will use this variable to add elements to our Set
		int coupon = 0;

		// this will be used to store our unique coupons
		HashSet<Integer> coupons = new HashSet<>();

		//start generating random no's and add them until we have the desired no of coupons
		while(couponCount <n)
		{
			coupon = random.nextInt(1001);

			// check if our newly generated coupon no is not present in the set			
			if(!(coupons.contains(coupon)))
			{
				coupons.add(coupon);
				couponCount++;
			}

			randomCounter++;

		}

		display(coupons, randomCounter);
	}

	// method to display our final output
	private static void display(HashSet<Integer> coupons, int randomCounter)
	{

		for (Integer coupon : coupons) 
		{
			System.out.print(coupon+ " ");
		}

		System.out.println("");

		System.out.println("Total no of random nos needed to generate the coupons were "+randomCounter);

	}
/******************Display Array*************************************************/
	// Method to take integer array input
	public static int[][] arrayInt(int m,int n)
	{
		int a[][]=new int[m][n];
		//Utility u=new Utility();    
		System.out.println();
		System.out.println("Integer Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				a[i][j] = scanner.nextInt();
			}   
		}
		return a;
	}

	//Method to take doubole array input
	public static double[][] arrayDouble(int m,int n)
	{
		double b[][]=new double[m][n];
		//Utility =new Utility();    
		System.out.println();
		System.out.println("Double Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				b[i][j] = utility.inputDouble();
			}   
		}
		return b;
	}

	//Method to take double array input
	public static String[][] arrayBoolean(int m,int n)
	{
		String c[][]=new String[m][n];
		//Utility u=new Utility();    
		System.out.println();
		System.out.println("Boolean Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				c[i][j] = Utility.inputString();
			}   
		}
		return c;
	}

	//display method
	public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
	{
		PrintWriter pw=new PrintWriter(System.out,true);

		//display integers
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				pw.print("\t"+a[i][j]+" ");
			} 
			pw.println("\t");
		}


		//display double
		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				pw.print("\t"+b[i][j]+" ");
			} 
			pw.println("\t");
		}

		//display boolean
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				pw.print("\t"+c[i][j]+" ");
			} 
			pw.println("\t");
		}
	}

	//Method to find the 3 number
	public boolean find3Numbers(int A[], int arr_size, int sum) 
	{
		// Fix the first element as A[i]
		for (int i = 0; i < arr_size - 2; i++) 
		{
			// Fix the second element as A[j]
			for (int j = i + 1; j < arr_size - 1; j++) 
			{
				// Now look for the third number
				for (int k = j + 1; k < arr_size; k++) 
				{
					if (A[i] + A[j] + A[k] == sum) 
					{
						System.out.print("Triplet is " + A[i] + " ," + A[j] 
								+" ," + A[k]);
						return true;
					}
				}
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	//Take a variable to store the time
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;

	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}

	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}

	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	private char [][] gameBoard;
	private boolean gameOnGoing = true;
	/***
	 * Thsi is the constructor for Gameboard class
	 */
	public void GameBoard()
	{
		gameBoard = new char[3][3];
		for (int row = 0; row < gameBoard.length; row++) 
		{
			Arrays.fill(gameBoard[row],' '); 
		}
	}//end of constructor

	/**
	 * This method will display the gameBoard to the screen
	 */

	public void dispalyBoard()
	{
		for (int row = 0; row < gameBoard.length; row++) 
		{
			for(int col = 0; col < gameBoard.length; col++)
			{
				System.out.print("\t"+gameBoard[row][col]);
				if(col == 0 || col == 1)
				{
					System.out.print("|");
				}
			}
			if(row == 0 || row == 1)
			{
				System.out.print("\n---------------------------\n");
			}

		}
		System.out.println();
	}//End of display method

	/*
	 * This method will return true if the game is still active
	 */

	public boolean gameActive()
	{
		return gameOnGoing;
	}

	/*
	 * This method will ask the user to pick a row and column. validate
	 * the input and call the method move
	 */

	public void askPlayer(char player)
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int row,col; 
		do
		{
			System.out.printf("Please %s enter a row from 1-3",player);
			row = keyboard.nextInt();

			System.out.printf("Plese %s col from 1-3",player);
			col = keyboard.nextInt();

		}while(notValid(row,col));
		makeMove(player, row-1, col-1);
	}//end of ask player method

	/*
	 * This method will chack to see if there are 3 O's or 3 X's in a row
	 * return true if there is a winner otherwise false
	 */

	public boolean checkForWinner()
	{
		//loop over each row and check for a winner

		for (int row = 0; row < gameBoard.length; row++) 
		{
			if(gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1] == gameBoard[row][2] && gameBoard[row][0] != ' ')

			{
				System.out.println("The winner is "+gameBoard[row][0]);
				gameOnGoing = false;
			}

		}
		// loop over for each column and check for a winner
		for (int col = 0; col < gameBoard.length; col++) 
		{
			if(gameBoard[0][col] == gameBoard[1][col] && gameBoard[1][col] == gameBoard[2][col] && gameBoard[0][col] != ' ')
			{
				System.out.println("The winner is "+gameBoard[0][col]);
				gameOnGoing = false;
			}

		}

		// check for cross

		if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != ' ')
		{
			System.out.println("The winner is"+gameBoard[0][0]);
			gameOnGoing = false;
		}
		if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2] && gameBoard[0][2] != ' ')
		{
			System.out.println("The winner is"+gameBoard[1][1]);
			gameOnGoing = false;
		}
		return false;

	}

	/*
	 * This method will validate if row and column are between 1-3
	 * and if position is currently empty 
	 */

	public boolean notValid(int row,int col)
	{
		if(row > 3 || row < 1 || col >3 || col <1 || !isEmpty(row, col))
			return true;
		else
			return false;
	}
	/*
	 * This method will check if a position is empty
	 * return true if position is empty othewise false
	 */ 

	public boolean isEmpty(int row, int col)
	{
		if(gameBoard[row-1][col-1] == ' ')
			return true;
		else
		{
			System.out.println("That position is taken\n");
			return false;
		}
	}

	/* This method will validate if a player move is alloed and return true
	 * if the move was completed
	 */

	public boolean makeMove(char player, int row, int col)
	{
		if(row >= 0 && row <= 2 && col >= 0 && col <=2)
		{
			if(gameBoard[row][col] != ' ')
			{
				return false;
			}
			else
			{
				gameBoard[row][col] = player;
				return true;
			}
		}
		else
		{
			return false;
		}
	}

	/*******************Euclidian Distance*****************************/
	public void euclidianDistance(int x,int y)
	{
		int distance =(int) Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
		System.out.println("Euclidian distance :" + distance);
		
	}
	
	/*********************Permutations**************************/

public static void swap(char[] ch, int i, int j)
{
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
}

public static void permutations(char ch[], int currentIndex)
{
	if(currentIndex==ch.length-1)
		System.out.println(String.valueOf(ch));
	for(int i=currentIndex;i<ch.length;i++)
	{
		swap(ch,currentIndex,i);
		permutations(ch,currentIndex + 1);
		swap(ch,currentIndex,i);
	}
}


/****************************Quadratic**********************************/
int root1_x,root2_x;
public void CalculateRoots(int a,int b,int c)
{
	double delta=(b*b)-(4*a*c);
	root1_x=(int) ((-b+Math.sqrt(delta))/(2*a));
	root2_x=(int) ((-b+Math.sqrt(delta))/(2*a));
System.out.println("x=" +root1_x);
System.out.println("x=" +root2_x);



}	
}