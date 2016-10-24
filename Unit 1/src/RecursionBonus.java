import java.util.Scanner;
public class RecursionBonus {

	public static void main(String[] args) {
			Scanner scn = new Scanner (System.in);
			System.out.println("Enter word:");
			String word = scn.nextLine();
			System.out.println("Same word inversed:");
			String s = scn.nextLine();
			reverseString(s);
			if (word.contentEquals(s)){
				System.out.println("The words: " + word + " and " + s + " match! TRUE");
			}
			else System.out.println("They don't match.FALSE");
		} 
		public static String reverseString(String s){
			if (s.length() <= 1) {
				return s;
			}
			return reverseString(s.substring(1)) + s.charAt(0);
		

	}

}
