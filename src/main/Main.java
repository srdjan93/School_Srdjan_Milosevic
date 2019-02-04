package main;

import computer.Computer;
import course.Course;
import student.Student;


public class Main {

    public static void main(String[] args) {
      
        Student customStudent = new Student();
        
        customStudent.setFirstName("Srdjan");
        customStudent.setLastName("Milosevic");
        customStudent.setYearOfBirth(1993);
        
        Course customCourse = customStudent.getCourse();
        customCourse.setCodeName("Cubes 2018");
        customCourse.setName("QA Tester");
        customCourse.setNumberOfClasses(5);
        
        Computer customComputer = customStudent.getComputer();
        customComputer.setHardDrive(1024);
        customComputer.setMemory(8.0);
        customComputer.setOperatingSystem("Windows");
        customComputer.setProcessTact(1.99);
      
        customStudent.info();
      
    }
    
}
