import java.util.Scanner;
public class NumDigits {
	static int num = 1;
	static int numNeg = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int n = Integer.parseInt(scn.nextLine());
		System.out.println(numDigs(n));
	}
	public static int numDigs (int n){


		if (n>=0 && n<=9){
			return 1;
		}
		else if(n<0){
			numNeg++;
			numDigs(n/10);
			return numNeg;
		}
		else{num++;
		numDigs(n/10);
		return num;
		}
	}
}



