package solution;

public class PD {

	private static boolean carOwner;
    private static char gender;  // IMPORTANT - assume only two values 'M' and 'F' are ever allowed in this field
    private static int  age;     // Assume validation does not allow any negative values here!
    
    // This can be invoked from Main by typing pd<dot>s(
    public static void Set(boolean carOwner, char gender, int age)
    {
        if ((gender != 'M' && gender != 'F') || age < 0)
        {
            System.out.printf("*** INVALID DATA ***");
            System.exit(0);
        }
        PD.carOwner = carOwner;
        PD.gender = gender;
        PD.age = age;
        System.out.printf("\nState is now: %b : '%c' : %d\n",carOwner,gender,age);
        
    }  

    // methods to be implemented
    public static boolean IsCarOwner()
    {
        return carOwner;
    }
    public static boolean IsMale()
    {
        return gender == 'M';
    }
    public static boolean IsFemale()
    {
        return !IsMale();
    }
    public static boolean IsTeenager()
    {
        return age >= 13 && age <= 19;
    }
    public static boolean IsNotTeenager()
    {
        return !IsTeenager();
    }

    public static boolean IsCarOwnerButNotTeenager()
    {
        return IsCarOwner() && !IsTeenager();
        //return IsCarOwner() && IsNotTeenager();
    }
    public static boolean IsMaleOrAge15()
    {
        return IsMale() || age == 15;
    }
    public static boolean IsFemaleCarOwnerOrNotATeenager()
    {
        return (IsFemale() && IsCarOwner()) || IsNotTeenager();  // extra parentheses not needed just for clarification 
    }
    public static boolean IsCarOwnerAndEitherFemaleOrNoLongerInTheirTwenties()
    {
        return IsCarOwner() && (IsFemale() || age >= 30); // extra parentheses needed to make the OR run first
    }

    public static String AgeDescription()
    {
        // this method must return one of these 3 values - "Pre-teen", "Teenager" or "Old" !!
        return age < 13 ? "Pre-teen" : age < 20 ? "Teenager" : "Old";
    }
}
