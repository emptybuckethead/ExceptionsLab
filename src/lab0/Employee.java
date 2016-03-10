package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 15;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private final int MAX_CHAR = 31;
    private final int MIN_CHAR = 1;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }
    //days vacation must be between 1-31, and cannot be negative 
    public final void setDaysVacation(int daysVacation) {
        if(daysVacation > MAX_VACATION_DAYS || daysVacation < MIN_CHAR || daysVacation >= 0){
            throw new IllegalArgumentException("you must take at least 1 vacation day but no more than 31");
        }
        this.daysVacation = daysVacation;
    }
    
    public final String getFirstName() {
        return firstName;
    }
    //FirstName cannot be null, empty or use stupid aschii characters that your hippy mom used to name you, min and max
    public final void setFirstName(String firstName) {
        if(firstName.isEmpty() ||  firstName.length() < MIN_CHAR || firstName.length() > MAX_CHAR){
            throw new IllegalArgumentException("invalid first name, cannot be more than 31 or less than 1");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }
    //lastName cannot empty or contain stupid aschii characters that your hippy mom used to name you, min and max
    public final void setLastName(String lastName) {
        if(lastName.isEmpty() ||  lastName.length() < MIN_CHAR || lastName.length() > MAX_CHAR){
            throw new IllegalArgumentException("invalid last name, cannot be more than 31 or less than 1");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    //ssn cannot be null, contian 9 numbers, cannot be empty
    public final void setSsn(String ssn) {
//        if(ssn == null || ssn > 9 || ssn < 9 || ssn.isEmpty()){
//            throw new IllegalArgumentException("invalid SSN");
//        }
        this.ssn = ssn;
    }
    
    
    
}
