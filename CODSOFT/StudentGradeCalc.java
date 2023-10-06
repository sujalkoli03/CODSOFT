import java.util.*;

public class StudentGradeCalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************-----------------------------****************************************");
        System.out.println("************************************ Welcome To Grade Calculator ****************************************");
        System.out.println("************************************-----------------------------****************************************");

        System.out.println();
  
        System.out.print("Enter total number of subjects: ");
        int TotalSubjects = sc.nextInt();

        // declare variables
        int total_marks = 0;
        int[] subjectMarks = new int[TotalSubjects];
        double Percentage;
        String grade;




        // Take marks of each subject
        for (int i = 0; i < TotalSubjects; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + " : ");
            subjectMarks[i] = sc.nextInt();

            // Validate input marks
            if (subjectMarks[i] < 0 || subjectMarks[i] > 100) {
                System.out.println("Please Enter Marks Between 0 to 100.");
                return;
            }

            // To Calculate total marks
            total_marks += subjectMarks[i];
        }

        // To calculate Percentage
        Percentage = (double) total_marks / TotalSubjects;

        // grades O A B C D F
        
        if (Percentage >= 90) {
            grade = "O";
        } else if (Percentage >= 80) {
            grade = "A";
        } else if (Percentage >= 70) {
            grade = "B";
        } else if (Percentage >= 60) {
            grade = "C";
        } else if (Percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n************************************Results Display****************************************");
        System.out.println();
        System.out.println("Grade obtained : " + grade);
        System.out.println("Total Percentage of all subjects : " + Percentage + "%");
        System.out.println("Total Marks of all subjects : " + total_marks + "/" + (TotalSubjects*100));
        System.out.println();
        
        

        sc.close();
    }
}