package oopcasestudy;

public class Undergraduate extends Student{
    String major;
    int yearLevel;
    
    public Undergraduate(){
    }
    
    public Undergraduate(int studentID, String studentName, String studentBirthdate, String major, int yearLevel){
        super (studentID, studentName, studentBirthdate);
         this.major = major;
         this.yearLevel = yearLevel;
    }
    
    // Method to get the student's major
    public String getMajor(){
        return major;
    }
    
    // Method to get the student's current year level
    public int getYearLevel(){
        return yearLevel;
    }
    
    // Method to set the student's major
    public void setMajor(){
        this.major = major;
    }
    
    // Method to set the student's current year level
    public void setYear(){
        this.yearLevel = yearLevel;
    }
    
    @Override
    public void displayStudentInformation(){
        super.displayStudentInformation();
        System.out.println("Major: " + this.getMajor());
        System.out.println("Year Level: " + this.getYearLevel());
    }
}
