import java.util.Scanner;
public class PalindromeRecursion1 {
	/*PalidromeRecursion.java program checks if both words are the same written reverse order.
	 *September 19, 2016
	 *Paola Villavicencio */

	public static boolean Palindrome(String n)
	{  
		int numLenght= n.length()-1;

		if(n.length() == 0 || n.length() == 1)
			return true; 
		// if there is only 1 or no letters the palindrome will be true
		if(n.charAt(0) == n.charAt(numLenght))
			// checks if the last and first n are the same
			return Palindrome(n.substring(1,numLenght));
		//returns a part of the word between length 1 and the ns length.. makes the length go down by one and goes back up to the top.
		return false;
		// returns that it is not a palindrome 
	}

	public static void main(String[]args)
	{
		boolean again =true;

		while( again==true)
		{

			//For capturing user input
			Scanner myScanner = new Scanner(System.in);
			System.out.println("Enter a n to see if it is a palindrome:");
			String result = myScanner.nextLine();
			// imputing ns
			// If Palindrome returns true then the string is
			//palindrome otherwise it is not

			if(Palindrome(result))
			{
				System.out.println("That is a palindrome");
				// prints out that it is a palindrome
			}
			else
			{
				System.out.println("That is not a palindrome");
				//prints out that it is not a palindrome
			}
			System.out.println("Would you like to play again? Y or N");
			String againresult = myScanner.nextLine();
			if( againresult.equalsIgnoreCase("n"))
			{
				again=false;
				// stops the loop
			}
			else if (againresult.equalsIgnoreCase("y"))
			{
				again= true;
				// continues the loop
			}


		}

	}

}
