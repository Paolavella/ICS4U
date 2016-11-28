
package objectsTwo;

import java.util.Scanner;
//to chose which algorimths to use with already set arrays
public class Test {
	static int []array ={1,2,3,4,5,6,7,8};
	static double []array2 ={1,2,3,4,5,6,7,8};
	static String []array3 ={"pink","black","yellow"};

	static int []arrayToSort ={5,7,6,3,8,1,2,4,9};
	static double []array2Sort ={5,7,6,3,8,1,2,4,9};
	static String []array3Sort ={"a","u","p","r","v","e"};
	static Scanner scn = new Scanner(System.in);



	public static void main(String[] args) {
		menu();
	}


	private static void menu() {
		System.out.print("Please choose type of searcher: int or double or string. For SORTING enter sort");// Find out what method to use
		String answer =scn.nextLine();
		if (answer.equalsIgnoreCase("int")){
			//gameOne();
		}
		else if (answer.equalsIgnoreCase("double")){
			//gameTwo();
		}
		else if (answer.equalsIgnoreCase("string")){
			//gameThree();
		}
		else if (answer.equalsIgnoreCase("Sort")){
			sortMethods();
		}
		else
			System.out.println("Sorry wrong input try again."); menu();
	}






	private static void sortMethods() {
		System.out.print("Please choose type of array: int or double or string");
		String answer =scn.nextLine();
		if (answer.equalsIgnoreCase("int")){
			intArray();
		}
		else if (answer.equalsIgnoreCase("double")){
			doubleArray();
		}
		else if (answer.equalsIgnoreCase("string")){
			stringArray();
		}
	}


	public static void intArray() {
		// Sort.selectionSort(arrayToSort, 0, arrayToSort.length-1);
		// Sort.insertionSort(arrayToSort);
		// Sort.bubbleSort(arrayToSort);
		// Sort.mergeSort(arrayToSort);
		Sort.quick(arrayToSort);
	}


	public static void doubleArray() {
		Sort.selectionSort(array2Sort, 0, array2Sort.length-1);
		Sort.insertionSort(array2Sort);
		Sort.bubbleSort(array2Sort);
		Sort.mergeSort(arrayToSort);

	}


	private static void stringArray() {
		Sort.selectionSort(array3Sort, 0, array3Sort.length-1);
		Sort.insertionSort(array3Sort);
		Sort.bubbleSort(array3Sort);
		Sort.mergeSort(arrayToSort);

	}











	// public static void gameOne() {
	// //same int array two different methods of search
	// System.out.print("Please choose a number between 1 and 8");// Find out what method to use
	// int findNumber = Integer.parseInt(scn.nextLine());
	// Search.binarySearch(array, findNumber);
	// Search.linearSearch(array, findNumber);
	// }
	//
	// public static void gameTwo(){
	// //same double array two different methods of search
	// System.out.print("Please choose type of searcher: int or double or string");// Find out what method to use
	// double findDouble = Integer.parseInt(scn.nextLine());
	// Search.binarySearch(array2, findDouble);
	// Search.linearSearch(array2, findDouble);
	// }
	//
	//
	// public static void gameThree() {
	// //same String array two different methods of search
	// System.out.print("Please choose type of colour: pink, yellow or black");// Find out what method to use
	// String answer = scn.nextLine();
	// Search.binarySearch(array3, answer);
	// Search.linearSearch(array3, answer);
	//
	//
	// }
	//
	//
}


