package objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *SchoolSystem class java
 * School System has all the methods that are used from the menu to add, remove and so on. On a student object that is store in a arrayList and as well it could save it into a java file.
 * October 31, 2016
 * Paola Villavicencio  
 * 
 */

import java.util.Scanner;
public class SchoolSystem {
	public static Scanner scn = new Scanner(System.in);
	public static ArrayList <Student> listOfStudents= new ArrayList<Student>(500);
	public static File file=new File("src\\students.txt"); 

	public static BufferedReader fbr;
	public static FileOutputStream fileOutputStream;
	public static PrintStream fps;
	static boolean yes = true;







	/**
	 *  Main method that sends to menu.
	 */
	public static void main(String[] args) throws InvalidInputException{
		menu();
	}







	/**
	 *  Menu method gives options to choose from to manipulate a student data.
	 */
	public static void menu() {
		System.out.println("What would you like to do: \nAdd new student enter 1 \nFind a Student enter 2 \nPrint all students enter 3 \nRemove a Student enter 4 \nTo save a students enter 5 \nTo load students enter 6 \nTo sort students enter 7 \nTo quit enter 10.");
		int choice = Integer.parseInt(scn.nextLine());
		if(choice==1){
			addNewStudent();
		}
		if(choice==2){
			findStudent();
		}
		if(choice==3){
			printAllStudents();
		}
		if(choice==4){
			removeStudent();
		}
		if(choice==5){
			saveStudents();
		} 
		if(choice==6){
			loadStudents();
		}
		if(choice==7){
			sortStudents();
		}
		if(choice==10){
			System.exit(0);
		}
		else
			System.out.println("Wrong input. Enter right number next time.");
		menu();
	}







	/**
	 *  Method that adds an student from the user.
	 */
	public static void addNewStudent (){
		boolean flag = false;

		/**
		 *  Creates an object Student.
		 */
		Student student= new Student();

		/**
		 *  Unused objects Students.
		 */
		@SuppressWarnings("unused")
		Student student2= new Student("Paola", "Villavicencio");
		@SuppressWarnings("unused")
		Student student3 = new Student ("Frances", "Ferrare", "Royal York st.", "Toronto", ProvincesTerritories.QUEBEC, "6475557541", "M6N5C1", "October 17, 1999", 30000000);

		/**
		 *Asks to input imformation of the student
		 */
		System.out.print("Input Name:");
		String name =scn.nextLine();
		
		System.out.print("Input Last name:");
		String lastName =scn.nextLine();
		
		System.out.print("Input Street name:");
		String street =scn.nextLine();
		
		System.out.println("Please enter the student's city.");
		String city =scn.nextLine();
		

		//Province input getting the provincesTerritories type to store it.
		System.out.println("Please enter the student's province using 1-14 numbers(e.g. 1.YUKON, 2.NORTHWESTERRITORIES, 3.NUNAVUT, 4.BRITISHCOLOMBIA, 5.ALBERTA, 6.SASKACHEWAN, 7.MANITOBA, 8.ONTARIO, 10.QUEBEC, 11.NEWFOUNDLAND, 12.PRINCEEDWARDISLAND, 13.NEWBRUNSWICK, 14.NOVASCOTIA)");
		flag=true;
		ProvincesTerritories valid=checkProvince(scn.nextLine());
		
		// Get the number from new student and checkin the size that has to be 10 numbers
		String pnumber = "6475557541";
		do{
			System.out.print("Input Phone Number:");
			pnumber =scn.nextLine();
			flag=false;
		}while(flag);
		System.out.print("Input Birthdate:");
		String birthday =scn.nextLine();
		
		boolean checker = true;
		System.out.print("Input PostCode:");
		String postCode = scn.nextLine();

		//Checking if is a valid postal code
		while(checker){

			//System.out.println(postCode);
			checker=true;
			if (postCode.length()!=6){
				System.out.println("Invalid postal code. Please enter a valid one.");
			}
			else{
				for (int i=0;i<6;i++){
					if ((i==0)&&(!checkChar(postCode.charAt(i)))||(i==2)&&(!checkChar(postCode.charAt(i)))||(i==4)&&(!checkChar(postCode.charAt(i)))){
						System.out.println("Invalid postal code. Please enter a valid one.");
						menu();
					}
					else if ((i==1)&&(!checkInt(postCode.charAt(i)))||(i==3)&&(!checkInt(postCode.charAt(i)))||(i==5)&&(!checkInt(postCode.charAt(i)))){
						System.out.println("Invalid postal code. Please enter a valid one.");
						menu();
					} 
					if (i==5){

						checker=false;}
				}
			}
		}

		int studentNumber = student.getStudentNumber(); 
		listOfStudents.add(new Student(name,lastName,street,city,valid,pnumber,postCode,birthday,studentNumber));
		for (int i=0;i<listOfStudents.size();i++){
			fps.println(listOfStudents.set(i, student).toString());			
		}
	
		
		//Printing out the information inputed of the student
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getStreetA());
		System.out.println(student.getCity());
		System.out.println(student.getProvince());
		System.out.println(student.getPhoneNumber());
		System.out.println(student.getBirthDate());
		System.out.println(student.getpostCode());
		System.out.println(student.getStudentNumber());
		
		
		
		menu();
	}












	/**
	 *  Prints information of the selected student.
	 */

	public static void findStudent (){
		{System.out.print("Input the number of Student you want to print:");
		int studNum= scn.nextInt();
		for (int g=0; g<listOfStudents.size(); g++){
			if(listOfStudents.get(g).getStudentNumber()==studNum){
				System.out.print(listOfStudents.get(g));
				menu();
			}
			System.out.println("INPUT VALID OF STUDENT NEXT TIME");
			menu();
		}
		}
	}













	/**
	 *  Prints the all info of all students.
	 */
	public static void printAllStudents (){
		for (int g=0; g<listOfStudents.size(); g++){
			System.out.print(listOfStudents.get(g));
			menu();
		}
		System.out.print("There is no students yet added.");
		menu();
	}













	/**
	 *  Compares the student number input with the ones in the list array until they are equal.
	 */
	public static void removeStudent (){		
		System.out.println("Which student do you want to remove, input their student number:");
		int i = Integer.parseInt(scn.nextLine());
		for (int g=0; g<listOfStudents.size(); g++){
			if(listOfStudents.get(g).getStudentNumber()==i){
				listOfStudents.remove(i);
				menu();
			}
			System.out.print("There is no students yet added.");
			menu();
		}

	}













	/**
	 * This method sets up the input and output objects for the file, and the file itself.
	 */
	public static void saveStudents(){
		try {
			fileOutputStream = new FileOutputStream ("src\\students.txt");
			fbr=new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			if (!file.exists())
				try {
					file.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
					menu();
				}
		}
		fps=new PrintStream(fileOutputStream);
	}













	/**
	 * This method loads the student list with information.   
	 */

	public static void loadStudents(){
		BufferedReader fbr;
		try{
			fbr = new BufferedReader (new FileReader("Students.txt"));
			int x= Integer.parseInt(fbr.readLine());//Reads the first line of the number of students that it has.
			for (int g=0; g<x; g++){// Goes trough the number of students saved.
				String stud [] = fbr.readLine().split(",");// splits the information between comas to store into array 
				Student student = new Student(stud[0]/*first name*/, stud[1]/*last name*/, stud[2]/*Street Adress*/,stud[3]/*City*/, checkProvince(stud[4])/*Province*/, stud[5]/*phone number*/,stud[6]/*birthdate*/,stud[7]/*postal code*/,Integer.parseInt(stud[8])/*Student Number*/);
				listOfStudents.add(student);//Adds it into the student array 
				menu();
			}
		}catch (IOException e){
			System.out.print("There is no students yet added.");
			menu();//goes back into menu
		}
	}















	/**
	 *  Sorts all students in the arraylist.
	 */
	@SuppressWarnings("unchecked")
	public static void sortStudents(){
		Collections.sort(listOfStudents);
		System.out.println(listOfStudents);
		System.out.println();
		menu();
	}











	/**
	 *  Check provinces method and it retursn a ProvincesTerritories type.
	 */
	public static ProvincesTerritories checkProvince(String input){
		while (true){
			switch (input){
			case "1":
				return ProvincesTerritories.YUKON;

			case "2":
				return ProvincesTerritories.NORTHWESTTERRITORIES;

			case "3":
				return ProvincesTerritories.NUNAVUT;

			case "4":
				return ProvincesTerritories.BRITISHCOLUMBIA;

			case "5":
				return ProvincesTerritories.ALBERTA;

			case "6":
				return ProvincesTerritories.SASKATCHEWAN;

			case "7":
				return ProvincesTerritories.MANITOBA;

			case "8":
				return ProvincesTerritories.ONTARIO;

			case "9":
				return ProvincesTerritories.QUEBEC;

			case "10":
				return ProvincesTerritories.NEWFOUNDLAND;

			case "11":
				return ProvincesTerritories.PRINCEEDWARDISLAND;

			case "12":
				return ProvincesTerritories.NEWBRUNSWICK;

			case "13":
				return ProvincesTerritories.NOVASCOTIA;

			default:{
				System.out.println("Please input a valid province");
				input=scn.nextLine();
			}


			}
		}
	}











	/**
	 *  Method that checks if is a integer.
	 */
	public static boolean checkInt(char x){
		if (x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9')
			return true;
		else
			return false;
	}










	/**
	 *  Method that checks if is a letter.
	 */
	public static boolean checkChar(char x){
		if (x=='a'||x=='b'||x=='c'||x=='d'||x=='e'||x=='f'||x=='g'||x=='h'||x=='i'||x=='j'||x=='k'||x=='l'||x=='m'||x=='n'||x=='o'||x=='p'||x=='q'||x=='r'||x=='s'||x=='t'||x=='u'||x=='v'||x=='w'||x=='x'||x=='y'||x=='z')
			return true;
		else
			return false;
	}

}