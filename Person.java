package FitnessPal;
/*
 * person class and fitness class
 * Author: Naresh Kc
 */

public class Person {
	
	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight; //Assume weight is in pounds
	private int feet;
	private int inches;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getLastNameInitial() {
		return lastNameInitial;
	}

	public void setLastNameInitial(char lastNameInitial) {
		this.lastNameInitial = lastNameInitial;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	
	
	public Person(String firstName,String lastName,double weight,int feet,int inches){
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		}
	public Person(String firstName,char lastNameInitial,double weight,int feet,int inches){
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		}
	
	public Person(String firstName,String lastName,char lastNameInitial,int age,double weight,int feet,int inches){
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		} // constructor
	
	String calculateBMI(){
		int heightInInches = (feet * 12 + inches);
		String bmiLevel = "";
		double BMI = (weight * 703)/(heightInInches * heightInInches);
		if(BMI <18.5)
			bmiLevel = "Underweight";
		else if(BMI >= 18.5 && BMI <= 24.9)
			bmiLevel = "Normal";
		else if(BMI >= 25 && BMI <= 29.9)
			bmiLevel = "Overweight";
		else if(BMI >=30)
			bmiLevel = "Obese";
		
		return (BMI +  ": " + bmiLevel);
	} // calculates BMI
	
	
	public String toString(){
		return("First Name: " + firstName + "\n"  +
				"Last Name: " + lastName + "\n"  +
				"Last Name Initial: " + lastNameInitial + "\n"  +
				"Age: " + age + "\n"  +
				"Weight: " + weight + "\n"  +
				"Feet: " + feet + "\n"  +
				"Inches " + inches + "\n");		
	}// converts into String
	

}

		
		
		
		