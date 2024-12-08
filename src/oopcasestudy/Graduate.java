package oopcasestudy;

public class Graduate extends Student{
    String thesisTopic, advisor;
    
    public Graduate(){
    }
    
    public Graduate(int studentID, String studentName, String studentBirthdate, String thesisTopic, String advisor){
        super(studentID, studentName, studentBirthdate);
        this.thesisTopic = thesisTopic;
        this.advisor = advisor;
    }
    
    // Method to get the student's thesis topic
    public String getThesisTopic(){
        return thesisTopic;
    }
    
    //Method to get the student's current advisor
    public String getAdvisor(){
        return advisor;
    }
    
    // Method to set the student's thesis topic
    public void setThesisTopic(String thesisTopic){
        this.thesisTopic = thesisTopic;
    }
    
    //Method to set the student's current advisor
    public void setAdvisor(String advisor){
        this.advisor = advisor;
    }
    
    @Override
    public void displayStudentInformation(){
        super.displayStudentInformation();
        System.out.println("Thesis Topic: " + this.getThesisTopic());
        System.out.println("Advisor: " + this.getAdvisor());
    }
}
