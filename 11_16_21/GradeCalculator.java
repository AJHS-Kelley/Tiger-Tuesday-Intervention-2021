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

    }
}