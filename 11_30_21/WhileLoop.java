// Grade Calculator Practice, 11/16/21
import java.util.Scanner;

public class GradeCalculator 
{
    public static void main(String[] args) {
        System.out.println("This program will take a numerical grade and print out the letter grade.\n");
        double grade;
        Scanner myScanner = new Scanner(System.in);
        grade = myScanner.nextDouble();
        System.out.println(grade);

        if (grade >= 89.5) {
            System.out.println("That grade is an A.\n");
        } else if (grade >= 79.5) {
            System.out.println("That grade is an B.\n");
        } else if (grade >= 69.5) {
            System.out.println("That grade is an C.\n");
        } else if (grade >= 59.5) {
            System.out.println("That grade is an D.\n");
        } else {
            System.out.println("That grade is an F.\n");
        }

    }
}