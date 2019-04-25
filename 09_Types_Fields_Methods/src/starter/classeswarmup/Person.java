package starter.classeswarmup;

public class Person {
    private String name;
    // author a 2nd field 'age'
    private int age ;
    
    private static int statePensionAge = 66 ;
    
    // author a constructor that receives a name an age and stores them
    
    public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

    public String getDetails()
    {
        return String.format("My name is %s and I am %d years old", this.name, this.age);
    }
    
    public static int getStatePensionAge() {
    	return statePensionAge ;
    }
    public int yearsToRetirement() {
    	return Person.statePensionAge - this.age ;
    }


	
}
