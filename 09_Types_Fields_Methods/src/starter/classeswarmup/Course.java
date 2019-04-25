package starter.classeswarmup;

public class Course {
    private String name, tutor;
    private int duration;

    // amend this constructor to receive 3 params called
    // name, tutor and numberDays and then store them
    public Course(String name, String tutor, int days) {
		this.name = name;
		this.tutor = tutor;
		duration = days;
	}

    public String getDetails()
    {
        return String.format("Course - %s, delivered by %s for %d days", 
                             name, tutor, duration);
    }

	
}
