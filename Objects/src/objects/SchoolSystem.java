package objects;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
public class SchoolSystem {
	static Scanner scn = new Scanner(System.in);
	static ArrayList <Student> listOfStudents= new ArrayList<Student>(500);
	static int studentNumber = 300000000;
	static Student student= new Student();

	
	
	public static void main(String[] args) throws InvalidInputException{
		menu();
    }


	public static void menu() {
		// TODO Auto-generated method stub
		System.out.println("What would you like to do: \nAdd new student enter 1 \nPrint a Student enter 2 \nPrint all students enter 3 \nRemove a Student enter 5 \nTo quit enter 10.");
		int choice = Integer.parseInt(scn.nextLine());
		if(choice==1){
			addNewStudent();
		}
		if(choice==2){
			printStudent();
		}
		if(choice==3){
			printAllStudents();
		}
		if(choice==4){
			removeStudent();
		}
		if(choice==5){
			replaceStudentInfo();
		}
		if(choice==6){
			sortStudent();}
		
		if(choice==10){
			System.exit(0);
		}
		else
			System.out.println("Wrong input. Enter right number next time.");
	}
	private static void sortStudent() {
		// TODO Auto-generated method stub
		
	}


	public static void replaceStudentInfo() {
		// TODO Auto-generated method stub

	}

	

	public static void addNewStudent (){

		addNewStudent();
		boolean flag = false;
		Student student1= new Student();
		Student student2= new Student("Paola", "Villavicencio");
		Student student3= new Student("Paola","Villavicencio","34 Jane Street","2334455555","March19","H4J5K6", studentNumber);

		System.out.print("Input Name:");
		listOfStudents.get(listOfStudents.size()-1).setFirstName(scn.nextLine());
		System.out.print("Input Last name:");
		listOfStudents.get(listOfStudents.size()-1).setLastName(scn.nextLine());
		System.out.print("Input Street Address:");
		listOfStudents.get(listOfStudents.size()-1).setStreetA(scn.nextLine());
		do{
			System.out.print("Input Phone Number:");// Get the number from new student
			try {
				listOfStudents.get(listOfStudents.size()-1).setPhoneNumber(scn.nextLine());
			} catch (InvalidInputException e) {

				e.printStackTrace();
				flag = true;
			}
		}while(flag);
		System.out.print("Input Birthdate:");
		listOfStudents.get(listOfStudents.size()-1).setBirthDate(scn.nextLine());
		System.out.print("Input PostCode:");
		try {
			listOfStudents.get(listOfStudents.size()-1).setpostCode(scn.nextLine());
		} catch (InvalidInputException e) {

			e.printStackTrace();
			flag = true;
		}


		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getStreetA());
		System.out.println(student.getPhoneNumber());
		System.out.println(student.getBirthDate());
		System.out.println(student.getpostCode());
		studentNumber++;
	}
	public static void printStudent (){
		System.out.print("Input the number of Student you want to print:");
		int studNum= scn.nextInt();
		System.out.print(listOfStudents.get(studNum));

	}

	public static void printAllStudents (){
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getStreetA());
		System.out.println(student.getPhoneNumber());
		System.out.println(student.getBirthDate());
		System.out.println(student.getpostCode());
	}
	public static void removeStudent (){
		System.out.println("Which student do you want to remove:");
		int i = Integer.parseInt(scn.nextLine());
		for (int g)
			ArrayList.remove(i, student);
	}


	public String toSave(){

		FileOutputStream saveFile;
		boolean exist = false;
		try {
			saveFile = new FileOutputStream("StudentsRecords.txt");
		} catch (FileNotFoundException e) {
			if (!saveFile.exists()){
				File f = new File("StudentRecords.txt"
						+ "");
			}
			else{
				exist=true;
			}
			e.printStackTrace();
		}
		PrintStream save = new PrintStream(saveFile);
		save.println("Test");
		save.close();

	}
	public String toLoad(){
		BufferedReader fbr = new BufferedReader(new FileReader(StudentRecords.txt));
		int x = Integer.parseInt(fbr.readLine());
		listOfStudents[]=(x.split(",") );
	}

}

//(String firstNameIn,String lastNameIn, String streetAIn, String phoneNumberIn, String postCodeIn, String birthdateIn, String studentNumberIn)





}
