package student;

import course.Course;
import computer.Computer;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the yearOfBirth
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * @param yearOfBirth the yearOfBirth to set
     */
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @return the computer
     */
    public Computer getComputer() {
        return computer;
    }

//    public Student() {
//        this.firstName = "Srdjan";
//        this.lastName = "Milosevic";
//        this.yearOfBirth = 1993;
//    }
    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public Student() {
        this.course = new Course();
        this.computer = new Computer();
    }

    public void info() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println("Year of birth: " + this.yearOfBirth);
        
    }

}
