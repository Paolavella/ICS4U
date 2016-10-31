package objects;
/*This is a student object that holds the same imformation with different data intput.   
 *October 28, 2016
 *Paola Villavicencio */

@SuppressWarnings("rawtypes")
public class Student implements Comparable{

	// all variables being declared
	private String firstName;
	private String lastName;
	private String streetA;
	private String city;
	private ProvincesTerritories province;
	private String phoneNumber;
	private String birthdate;
	private String postCode;

	private static long idGenerator=300000000;
	private long studentNumber = idGenerator;





	public Student(String firstNameInput, String lastNameInput) {
		firstName= firstNameInput;// set variable name 
		lastName= lastNameInput;// set variable last name 
		streetA= ("");// set variable name 
		streetA= ("");// set variable name
		city= ("");
		province= (ProvincesTerritories.ALBERTA);
		phoneNumber = ("");// set variable name 
		postCode= ("");// set variable name 
		birthdate= ("");// set variable name 
		studentNumber=idGenerator+1;
	}


	public Student(String firstNameIn, String lastNameIn, String streetIn, String cityIn, ProvincesTerritories provinceIn, String phoneIn, String postCodeIn, String birthdayIn, int studentNumIn) {
		firstName= firstNameIn;// set variable name 
		lastName= lastNameIn;// set variable last name 
		streetA= streetIn;// set variable name 
		city= cityIn;
		province= provinceIn;
		phoneNumber = phoneIn;// set variable name 
		postCode= postCodeIn;// set variable name 
		birthdate= birthdayIn;// set variable name 
		studentNumber=studentNumIn; }

	public Student() {
		firstName= ("");// set variable name 
		lastName= ("");// set variable name 
		streetA= ("");// set variable name 
		city= ("");
		province= (ProvincesTerritories.ALBERTA);
		phoneNumber = ("");// set variable name 
		postCode= ("");// set variable name 
		birthdate= ("");// set variable name 
		studentNumber=idGenerator+1;
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
	public void setCity(String fcity){

		this.city= fcity;// set variable name 
	}
	public void setProvince(ProvincesTerritories fprovince){

		this.province= fprovince;// set variable name 
	}

	public void setPhoneNumber(String fphone) throws InvalidInputException{
		this.phoneNumber=fphone;// set variable phone
		if (phoneNumber.length() >= 10){// max number of digits
			throw new InvalidInputException(); 
		}
	}
	public void setBirthDate(String fbirth){
		this.birthdate=fbirth;// set variable birth date
	}
	public void setpostCode(String fpostcode) throws InvalidInputException{
		this.postCode=fpostcode;// set variable birth date
		throw new InvalidInputException(); 
	}
	public void setStudentNumber(long fstudnum){
		this.studentNumber=fstudnum;// set variable birth date
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
	public String getCity(){
		return this.city;
	}
	public ProvincesTerritories getProvince(){
		return this.province;
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
	public int getStudentNumber(){
		return (int) this.studentNumber;// return variable student number
	}

	
	
	//Compares Student number
	public int compareTo(Object j) {

		Student tempStudent=(Student)j;
		return this.getLastName().compareTo(tempStudent.getLastName());
	}
	
	
	//Make Student object into a String line
	public String toString(){
		return firstName+","+lastName+","+streetA+","+city+","+province+","+phoneNumber+","+postCode+","+birthdate+","+ studentNumber;

	}
	
	
	//Compares if two students are equal
	public boolean equals(Student x){
		if (this.studentNumber==x.studentNumber)
			return true;
		else
			return false;
	}




}