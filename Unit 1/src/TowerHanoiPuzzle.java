import java.util.Scanner;
public class TowerHanoiPuzzle {
	/*TowerHanoiPuzzle.java program allows the user to know the order of the movements by recursive methods. According to the number of disk sent they input to solve the Hanoi Towers.
	 *September 19, 2016
	 *Paola Villavicencio */

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter number of disk:");// number of disks that the user has to solve.
		int n= Integer.parseInt(scn.nextLine());
		hanoiMove(n, 'A', 'B', 'C');//call a method that store 4 variables one for the number of disk and the other 3 are SAD (Source, Auxilary, Destination)
		}
	
	
	
		public static void hanoiMove(int n, char s, char a, char d) {//method that changes the A, B and C and tell us where to move
		if (n==1){
		System.out.println("Disk 1 move from: " + s + " to "+ d);// stays the same if is one disk that moves from A to C
		}
		else{
		hanoiMove(n-1, s, d, a);// going to the right of the program, renaming A, B and C
		System.out.println("Disk "+ n +" move from: " + s + " to "+ d);// printing out move
		hanoiMove(n-1, a, s, d);// going to left of the program, renaming A, B and C
		}


	}

}
