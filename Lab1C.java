import java.util.Scanner;

/*
Class: CSE 1321L
Section: WJ1
Term: FALL22
Instructor: Nick Murphy
Name: Takeria Thompson
Lab#: 1
*/
public class Lab1C
{
    // Calculates fuel efficiency based on values entered by the user.
    public static void main(String[] args)
    {
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the number of miles: ");
        miles = scan.nextInt();

        System.out.print ("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;
        System.out.println ("Miles Per Gallon: " + mpg);
    }
}
