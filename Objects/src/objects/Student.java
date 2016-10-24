package objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*TowerHanoiPuzzle.java program allows the user to know the order of the movements by recursive methods. According to the number of disk sent they input to solve the Hanoi Towers.
 *September 19, 2016
 *Paola Villavicencio */

public class Student  {

	// all variables being declared
	private String firstName;
	private String lastName;
	private String streetA;
	private String phoneNumber;
	private String birthdate;
	private String postCode;
	private int studentNum;
	Scanner scn = new Scanner(System.in);




	public Student(String firstNameInput, String lastNameInput) {
		firstName= firstNameInput;// set variable name 
		lastName= lastNameInput;// set variable last name 
		streetA= ("");// set variable name 
		phoneNumber = ("");// set variable name 
		postCode= ("");// set variable name 
		birthdate= ("");// set variable name 
	}


	public Student(String firstNameIn, String lastNameIn, String streetIn, String phoneIn, String postCodeIn, String birthdayIn, int studentNumIn) {
		firstName= firstNameIn;// set variable name 
		lastName= lastNameIn;// set variable last name 
		streetA= streetIn;// set variable name 
		phoneNumber = phoneIn;// set variable name 
		postCode= postCodeIn;// set variable name 
		birthdate= birthdayIn;// set variable name 
		studentNum=studentNumIn+1;	}

	public Student() {
		firstName= ("");// set variable name 
		lastName= ("");// set variable name 
		streetA= ("");// set variable name 
		phoneNumber = ("");// set variable name 
		postCode= ("");// set variable name 
		birthdate= ("");// set variable name 
	}






	public void setFirstName(String fname){

		this.firstName= fname;// set variable name 
	}
	public void setLastName(String flastname){
		this.lastName= flastname;//set variable lastName
	}
	public void setStreetA(String fstreet){
		this.streetA=fstreet;//send variable street
	}
	@SuppressWarnings("serial")
	public void setPhoneNumber(String fphone) throws InvalidInputException{
		this.phoneNumber=fphone;// set variable phone
		if (phoneNumber.length() != 10&&phoneNumber.length() != 0){// max number of digits
			throw new InvalidInputException(); 
		}
	}
	public void setBirthDate(String fbirth){
		this.birthdate=fbirth;// set variable birth date
	}
	public void setpostCode(String fpostcode) throws InvalidInputException{
		this.postCode=fpostcode;// set variable birth date
		/*if (postCode.chart[0]!=0 && postCode.chart[0]!= 9){// cheking is a capital letter
			if (postCode.chart[1]>= 0 && postCode.chart[1]<= 9){// cheking if is a number
				if (postCode.chart[2]!= 0 && postCode.chart[2]!= 9){
					if (postCode.chart[3]>= 0 && postCode.chart[3]<= 9){
						if (postCode.chart[4]!= 0 && postCode.chart[4]!= 9){
							if (postCode.chart[5]>= 0 && postCode.chart[5]<= 9){}
						}
					}
				}
			}
		}
		else
			throw new InvalidInputException(); */
	}


	// Send all variables set above to the main method on School System

	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getStreetA(){
		return this.streetA;
	}
	public String getPhoneNumber(){

		return this.phoneNumber;
	}
	public String getBirthDate(){
		return this.birthdate;
	}
	public String getpostCode() {
		return this.postCode;

	}
	public String toString(){
		return firstName+","+lastName+","+streetA +","+phoneNumber+","+postCode+","+birthdate;

	}
}