import java.util.Scanner;

/*Class: CSE 1321L
        Section: WJ1
        Term: fall 2022
        Instructor: Nick Murphy
        Name: Takeria Thompson
        Lab#: 4
*/
public class Lab4A {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score of your exam: ");
        float grade = scan.nextFloat();

        if (grade >= 97.5f && grade <= 100f)
        {
            System.out.print("Letter grade is: A+");
        }
        else if (grade <= 97f && grade >= 95f)
        {
            System.out.print("Letter grade is: A");
        }
        else if (grade <= 94f && grade > 92f)
        {
            System.out.print("Letter grade is: A-");
        }
        else if (grade >= 91f && grade <= 89f)
        {
            System.out.print("Letter grade is: B+");
        }
        else if (grade >= 88f && grade <= 86f)
        {
            System.out.print("Letter grade is: B");
        }
        else if (grade >= 85f && grade <= 83f)
        {
            System.out.print("Letter grade is: B-");
        }
        else if (grade >= 82f && grade <= 80f)
        {
            System.out.print("Letter grade is: C+");
        }
        else if (grade >= 79f && grade <= 77f)
        {
            System.out.print("Letter grade is: C");
        }
        else if (grade >= 76f && grade <= 74f)
        {
            System.out.print("Letter grade is: C-");
        }
        else if (grade >= 73f && grade <= 71f)
        {
            System.out.print("Letter grade is: D+");
        }
        else if (grade >= 70f && grade <= 68f)
        {
            System.out.print("Letter grade is: D");
        }
        else if (grade >= 67f && grade <= 65f)
        {
            System.out.print("Letter grade is: D-");
        }
        else if (grade <= 64f)
        {
            System.out.print("Letter grade is: F");
        }
        else {}


    }
}
