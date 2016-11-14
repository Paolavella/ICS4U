package objectsTwo;

public class Search {

	// At the methods the program starts to use the strategy that each should manage
	//Binary Search finds between number and finds the number the user wants 
	private static int binarySearch(int startIndex, int endIndex, int []array, int findNumber){
		int midNumber= (startIndex+endIndex)/2;// search mid number in the array
		if (array[midNumber]==findNumber){// compares if the number isequals to the number the user wants to find
			System.out.print("We found the number: " + midNumber);
			return findNumber;
		}
		else if (array[midNumber]>findNumber){
			System.out.println(midNumber);
			return binarySearch(midNumber+1, array.length-1, array, findNumber);
		}
		else if(array[midNumber]<findNumber){
			return binarySearch(0,array.length-1, array, findNumber);
		}
		return-1;
	}
	private static int binarySearch(int startIndex, int endIndex, double []array2, double findNumber){
		int midNumber= (startIndex+endIndex)/2;// search mid number in the array
		if (array2[midNumber]==findNumber){// compares if the number isequals to the number the user wants to find
			System.out.print("We found the number: " + midNumber);
			return midNumber;
		}
		else if (array2[midNumber]>findNumber){
			System.out.println(midNumber);
			return binarySearch(midNumber+1, array2.length-1, array2, findNumber);
		}
		else if(array2[midNumber]<findNumber){
			return binarySearch(0,array2.length-1, array2, findNumber);
		}
		return-1;
	}
	private static String binarySearch(int startIndex, int endIndex, String []array3, String findword){
		int midNumber= (startIndex+endIndex)/2;// search mid number in the array
		if (array3[midNumber].equalsIgnoreCase(findword)){// compares if the number isequals to the number the user wants to find
			System.out.print("We found the number: " + midNumber);
			return findword;
		}
		else if (array3[midNumber].length() > findword.length()){
			System.out.println(midNumber);
			return binarySearch(midNumber+1, array3.length-1, array3, findword);
		}
		else if(array3[midNumber].length() <findword.length()){
			return binarySearch(0,array3.length-1, array3, findword);
		}
		return "Yeah!";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//Linear Search in int values that finds goes one by one through the array and finds the number the user wants 
	private static int linearSearch(int startIndex, int endIndex, int []array, int findNumber){
		for (int g=0; g<array.length; g++){
			System.out.print(array[g]);
			if(array[g] == findNumber){
				System.out.print( "Found"+findNumber+"number!"); // Go trough the array until number found
				break;
			}

		}
		return-1;
	}
	private static int linearSearch(double startIndex, double endIndex, double []array2, double findNumber){
		for (int g=0; g<array2.length; g++){
			System.out.print(array2[g]);
			if(array2[g] == findNumber){
				System.out.print( "Found"+findNumber+"number!"); // Go trough the array until number found
				break;
			}

		}
		return-1;
	}
	private static String linearSearch(int startIndex, int endIndex, String []array3, String answer){
		for (int g=0; g<array3.length; g++){
			System.out.print(array3[g]);
			if(array3[g] == answer){
				System.out.print( "Found"+answer+"number!"); // Go trough the array until number found
				break;
			}

		}
		return "Yeah";
	}


	
	
	
	
	
	
	
	
	
	
	
	//User frienly to only modify the number that should be search and the type of array
	public static int binarySearch(int []array, int findNumber){//setting the other values except fot the mid value to the the private methods
		return linearSearch(0, array.length-1, array, findNumber);//It passes the information to the private contructors which have already the starting and end points of the array
	}
	public static int binarySearch(double []array, double findNumber){//setting the other values except fot the mid value to the the private methods
		return linearSearch(0, array.length-1, array, findNumber);//It passes the information to the private contructors which have already the starting and end points of the array
	}
	public static String binarySearch(String []array, String findNumber){//setting the other values except fot the mid value to the the private methods
		return linearSearch(0,array.length-1, array, findNumber);//It passes the information to the private contructors which have already the starting and end points of the array
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Linear Search friendly method
	public static int linearSearch(int []array1, int findNumber){//setting the other values except fot the mid value to the the private methods
		return linearSearch(0, array1.length-1, array1, findNumber);//It passes the information to the private contructors which have already the starting and end points of the array

	} 
	public static int linearSearch(double []array1, double findNumber){//setting the other values except fot the mid value to the the private methods
		return linearSearch(0, array1.length-1, array1, findNumber);//It passes the information to the private contructors which have already the starting and end points of the array

	} 
	public static String linearSearch(String []array3, String answer){//setting the other values except fot the mid value to the the private methods
		return linearSearch(0, array3.length-1, array3, answer);//It passes the information to the private contructors which have already the starting and end points of the array

	} 
}
