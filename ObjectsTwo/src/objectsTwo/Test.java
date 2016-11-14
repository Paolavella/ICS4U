package objectsTwo;

import java.util.Scanner;
//to chose which algorimths to use with already set arrays
public class Test {
	static int []array ={1,2,3,4,5,6,7,8};
	static double []array2 ={1,2,3,4,5,6,7,8};
	static String []array3 ={"pink","black","yellow"};
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Please choose type of searcher: int or double or string");// Find out what method to use
		String answer =scn.nextLine();
		if (answer.equalsIgnoreCase("int")){
			gameOne();
		}
		if (answer.equalsIgnoreCase("double")){
			gameTwo();
		}
		if (answer.equalsIgnoreCase("string")){
			gameThree();
		}

	}
	public static void gameOne() {
		//same int array two different methods of search
		System.out.print("Please choose a number between 1 and 8");// Find out what method to use
		int findNumber = Integer.parseInt(scn.nextLine());
		Search.binarySearch(array, findNumber);
		Search.linearSearch(array, findNumber);
	}

	public static void gameTwo(){
		//same double array two different methods of search
		System.out.print("Please choose type of searcher: int or double or string");// Find out what method to use
		double findDouble = Integer.parseInt(scn.nextLine());
		Search.binarySearch(array2, findDouble);
		Search.linearSearch(array2, findDouble);
	}


	public static void gameThree() {
		//same String array two different methods of search
		System.out.print("Please choose type of colour: pink, yellow or black");// Find out what method to use
		String answer = scn.nextLine();
		Search.binarySearch(array3, answer);
		Search.linearSearch(array3, answer);


	}


}
