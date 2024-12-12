package oopcasestudy;
import java.util.Scanner;

public class RunProgram {
    public static void run(){
        String name, birthdate, major, thesis, advisor;
        int studentID, yearLevel;
        Scanner userInput = new Scanner(System.in);
        Boolean run = true;
        StudentManagement studentManager = new StudentManagement();
        
        do{
            System.out.println("\nWhat would you like to do?(Choose a number): ");
            System.out.println("1: Add A Student \n2: Remove A Student \n3: Find Student \n4: Exit");
            int choice = userInput.nextInt();
            userInput.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("\nIs the student graduate or undergraduate?: ");
                    String studentType = userInput.nextLine();

                    switch(studentType.toLowerCase()){
                        case "undergraduate":
                            System.out.println("Enter Student ID: ");
                            studentID = userInput.nextInt();
                            userInput.nextLine();

                            System.out.println("Enter Student Name(LN, FN, MI): ");
                            name = userInput.nextLine();

                            System.out.println("Enter Student Birthdate(Ex. January 1, 2000): ");
                            birthdate = userInput.nextLine();

                            System.out.println("Enter Student Major: ");
                            major = userInput.nextLine();

                            System.out.println("Enter Student Year Level: ");
                            yearLevel = userInput.nextInt();

                            studentManager.addStudent(new Undergraduate(studentID, name, birthdate, major, yearLevel));
                            System.out.println("\nStudent has been added.\n");
                            break;

                        case "graduate":
                            System.out.println("Enter Student ID: ");
                            studentID = userInput.nextInt();
                            userInput.nextLine();

                            System.out.println("Enter Student Name(LN, FN, MI): ");
                            name = userInput.nextLine();

                            System.out.println("Enter Student Birthdate(Ex. January 1, 2000): ");
                            birthdate = userInput.nextLine();

                            System.out.println("Enter Student Thesis Topic: ");
                            thesis = userInput.nextLine();

                            System.out.println("Enter Advisor Name: ");
                            advisor = userInput.nextLine();

                            studentManager.addStudent(new Graduate(studentID, name, birthdate, thesis, advisor));
                            System.out.println("\nStudent has been added.\n");
                            break;

                        default:
                            System.out.println("\nStudent Type Not Included.\n");
                            break;
                    }
                    break;
                    
                case 2:
                    System.out.println("\nEnter The Student's ID Number: ");
                    studentID = userInput.nextInt();
                    userInput.nextLine();
                    
                    studentManager.removeStudent(studentID);
                    break;
                    
                case 3:
                    System.out.println("\nHow would you like to find the student:\n1: By ID Number    2: By Student Name");
                    int findBy = userInput.nextInt();
                    userInput.nextLine();
                    
                    switch(findBy){
                        case 1:
                            System.out.println("\nEnter The Student's ID Number: ");
                            studentID = userInput.nextInt();
                            userInput.nextLine();
                            
                            studentManager.findStudent(studentID);
                            break;
                            
                        case 2:
                            System.out.println("\nEnter The Student's Name(LN, FN, MI): ");
                            name = userInput.nextLine();
                            
                            studentManager.findStudent(name);
                            break;
                            
                        default:
                            System.out.println("\nInput Error!\n");
                            break;
                    }
                    break;
                
                case 4:
                    run = false;
                    break;
                    
                default:
                    System.out.println("\nInput Error!\n");
                    break;
            }
            
        } while(run);
    }
}
