import java.util.Scanner;

/*
Class: CSE 1321L
Section: WJ1
Term: FALL22
Instructor: Nick Murphy
Name: Takeria Thompson
Lab#: 1
*/
public class Lab1B
{
    // Reads a character string from the user and prints it.
    public static void main(String[] args)
    {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter a line of text: ");
        message = scan.nextLine();
        System.out.println ("You wrote'" + message + "'");
    }
}