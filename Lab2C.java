import java.util.Scanner;

/*Class: CSE 1321L
        Section: WJ1
        Term: fall 2022
        Instructor: Nick Murphy
        Name: Takeria Thompson
        Lab#: 2
*/
public class Lab2C {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a width:");
        int width = scan.nextInt();

        System.out.println("Enter a height:");
        int height = scan.nextInt();

        int area = width * height;
        int perimeter = 2*(height + width);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}
