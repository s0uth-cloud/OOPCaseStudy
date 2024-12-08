package oopcasestudy;

public class Student {
    String studentName, studentBirthdate;
    int studentID;
    
    public Student(){
    }
    
    public Student(int studentID, String studentName, String studentBirthdate){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentBirthdate = studentBirthdate;
    }
    
    // Method to get student's ID number
    public int getId() {
        return studentID;
    }

    // Method to get the student's name
    public String getName() {
        return studentName;
    }
    
    // Method to get the student's birthdate
    public String getBirthdate() {
        return studentBirthdate;
    }
    
    // Method to set student's ID number
    public void setID(int studentID) {
        this.studentID = studentID;
    }

    // Method to set the student's name
    public void setName(String studentName) {
        this.studentName = studentName;
    }
    
    // Method to set the student's birthdate
    public void setBirthdate(String studentBirthdate) {
        this.studentBirthdate = studentBirthdate;
    }
    
     public void displayStudentInformation(){
        System.out.println("ID Number: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Birthdate: " + this.getBirthdate());
    }
    
}
