package oopcasestudy;

public class StudentManagement implements ManagementFunctions{
    final int maxStudents = 100;
    Student[] students;
    int numOfStudents;
    
    public StudentManagement(){
        students = new Student[maxStudents];
        numOfStudents = 0;
    }
    
    public void addStudent(Student student){
        if (numOfStudents>=maxStudents){
        System.out.println("Student list is full!");    
        }
        else{
            students[numOfStudents] = student;
            numOfStudents++;
        }        
    }
    
    // Method to remove students from the array
    public void removeStudent(int studentId){
        
        for(int i=0;i<numOfStudents;i++){
            if(students[i].getId()==studentId){
                for(int j=i;j<numOfStudents-1;j++){
                    students[j]=students[j+1];
                }
                students[numOfStudents-1]=null;
                numOfStudents--;
                System.out.println("Student has been removed.");
            }
        }
    }
    
    // Method to search for students by name
    public void findStudent(String studentName){
        for(int i=0;i<numOfStudents;i++){
            if(studentName.equalsIgnoreCase(students[i].getName())){
                students[i].displayStudentInformation();
                return; 
            }
        }
        System.out.println("Student cannot be found");
    }
    
    // Method to search for students by ID
    public void findStudent(int studentId){
        for(int i =0;i<numOfStudents;i++){
            if(students[i].getId()==studentId){
                students[i].displayStudentInformation();
                return;
            }
        }
        System.out.println("Student cannot be found");
    }
}
    


