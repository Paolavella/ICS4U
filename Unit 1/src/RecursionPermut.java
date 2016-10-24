import java.util.Scanner;
public class RecursionPermut {
	/*Recursion.java program gets the r and n for the user and solves for number of permutations by P = n!/(n-r)!.
	 *September 19, 2016
	 *Paola Villavicencio */

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int userN=0;
		int userR=0;
		System.out.print("You will enter two numbers. \nPlease enter the first number n:");//get the user's n
		userN=Integer.parseInt(scn.nextLine());
		System.out.print("Now enter another number r \n(it has to be higher than n):");// get r
		userR=Integer.parseInt(scn.nextLine());
		permut(userN,userR);// call method 
	}
	public static void permut(int n, int r){
		int firstNumber=methodFactorial(n);// calls Factorial method to find the factorial of the numerator
		int secondNumber=methodFactorial(n-r);// calls Factorial method to find the factorial of the denominator
		int permutations = firstNumber/secondNumber;//result of number of permutations by solving n/n-r
		System.out.println("For number n (" + n + ") and r (" + r + "). There are "+ permutations +" permutations");// prints the number of permutations 
	}
	public static int methodFactorial(int numFactorial){// Method that finds factorial for both n and n-r
		if (numFactorial==1)
		{
			return numFactorial;
		}
		return numFactorial*methodFactorial(numFactorial-1);// going back to each number subtracting one. Afterwards multiplies them all and returns the result to method Permut.
	}

}

}
