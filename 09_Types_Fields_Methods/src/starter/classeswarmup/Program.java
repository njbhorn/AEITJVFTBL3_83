package starter.classeswarmup;

public class Program {

	public static void main(String[] args) {
        // Section 1 - CAR
        // Declare 2 variables of type Car call them 'c1' and 'c2'
		Car c1, c2 ;
        // Give each variable a value
		c1 = new Car ("Ford", 4 ) ;
		c2 = new Car ("Skoda") ;

        // Just display on the console the model of each car 

		System.out.println(c1.getModel());
		System.out.println(c2.getModel());
		System.out.println(c1);
		System.out.println(c2);


        // Section 2 - PERSON
        // A variable of type Person
        Person p1;
        
        // Give it a value
        p1 = new Person("Jackie", 16) ;
        
        // Display the persons details 
        System.out.println(p1.getDetails());
        System.out.println(Person.getStatePensionAge());
        System.out.println(p1.yearsToRetirement());

        // Section 3 - COURSE
        // A variable of type course ,initialise it on this line
        Course course = new Course("java Fund", "Nigel", 8); 
        // Display the course's details
        System.out.println(course.getDetails());

        // Section 4 - static vs instance
        System.out.println(Car.getDVLALocation());


	}

}
