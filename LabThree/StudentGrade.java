import java.util.Scanner; 
public class StudentGrade { 
public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
 
     
        System.out.print("Enter student's marks (0-100): "); 
        int marks = input.nextInt(); 
 
         
        String grade; 
        if (marks >= 80) { 
            grade = "A+"; 
        } else if (marks >= 75) { 
            grade = "A"; 
        } else if (marks >= 70) { 
            grade = "A-"; 
        } else if (marks >= 65) { 
            grade = "B"; 
        } else if (marks >= 60) { 
            grade = "B+"; 
        } else if (marks >= 55) { 
            grade = "B-"; 
        } else if (marks >= 50) { 
            grade = "C+"; 
        } else if (marks >= 45) { 
            grade = "C"; 
        } else if (marks >= 40) { 
            grade = "D"; 
        } else { 
            grade = "F"; 
        } 
 
  
        System.out.println("The student's grade is: " + grade); 
 
        input.close(); 
    } 
}
