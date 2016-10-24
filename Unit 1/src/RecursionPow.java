import java.util.Scanner;
/*RecursionPow.java program collects the power of the base of 2 by the user. Then it prints
 *September 19, 2016
 *Paola Villavicencio */

public class RecursionPow {
	static int num = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input number for the power of the base 2:");// getting power
		int nUser = Integer.parseInt(scn.nextLine());
		numDigs(nUser);// calling method

	}

	public static void numDigs(int nUser) {
		if (nUser > 0) {
			int n = (int) Math.pow(2, nUser);// solving
			numDigs(nUser - 1);
				System.out.print("*");//printing stars

				nUser = nUser - 1;
				num++;
			
			System.out.println();

		} else if (nUser == 0) {
			System.out.print("*");
		}
	}

}
