package FitnessPal;

public class Fitness {

	public static void main(String[] args) {
		Person person1 = new Person("Tom", 'H', 152.5, 5, 6);
		Person person2 = new Person("Leslie", "Knope",'K',32, 122.9, 4, 11);
		Person person3 = new Person("Ron", "Swanson", 222.2, 6, 0);
		Person person4 = new Person("April", "Ludgate", 110.5, 5, 5);

		System.out.println(person1.getFirstName() + ": " + person1.calculateBMI() );
		System.out.println(person2.getFirstName() + ": " + person2.calculateBMI() );
		System.out.println(person3.getFirstName() + ": " + person3.calculateBMI() );
		System.out.println(person4.getFirstName() + ": " + person4.calculateBMI() );
		System.out.println("\n");

		
		System.out.println(person1); // Print all attributes of person1
		System.out.println(person2);// Print all attributes of person2
		System.out.println(person3);// Print all attributes of person3
		System.out.println(person4);// Print all attributes of person4
	
	}
}
