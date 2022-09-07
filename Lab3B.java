import java.util.Scanner;
/*Class: CSE 1321L
        Section: WJ1
        Term: fall 2022
        Instructor: Nick Murphy
        Name: Takeria Thompson
        Lab#: 2
*/
public class Lab3B {
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Course 1 hours: ");
       float course1Hours = scan.nextFloat();
       System.out.println("Grade for course 1: ");
       float course1Grade = scan.nextFloat();
        
       System.out.println("Course 2 hours: ");
       float course2Hours = scan.nextFloat();
       System.out.println("Grade for course 2: ");
       float course2Grade = scan.nextFloat();

       System.out.println("Course 3 hours: ");
       float course3Hours = scan.nextFloat();
       System.out.println("Grade for course 3: ");
       float course3Grade = scan.nextFloat();

       System.out.println("Course 4 hours: ");
       float course4Hours = scan.nextFloat();
       System.out.println("Grade for course 4: ");
       float course4Grade = scan.nextFloat();
       
       float totalHours = course1Hours+course2Hours + course3Hours + course4Hours;
       float totalQualityPoints =
               (course1Hours*course1Grade)
               + (course2Hours * course2Grade)
                       +(course3Hours * course3Grade)
               + (course4Hours * course4Grade);
       float gpa = totalQualityPoints/totalHours;
       
       System.out.println("Total hours is: " + totalHours);
       System.out.println("Total quality points is: " + totalQualityPoints);
       System.out.println("Your GPA for this semester is " + gpa);
       
       
       scan.close();
    }
}