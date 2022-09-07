import java.text.DecimalFormat;
import java.util.Scanner;

/*Class: CSE 1321L
        Section: WJ1
        Term: fall 2022
        Instructor: Nick Murphy
        Name: Takeria Thompson
        Lab#: 2
*/
public class Lab3C {
        final static float quarterWorth = 0.25f;
        final static float dimeWorth = 0.10f;
        final static float nickelWorth = 0.05f;
        final static float pennyWorth = 0.01f;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        float userQ = scan.nextFloat();
        System.out.print("Enter the number of dimes: ");
        float userD = scan.nextFloat();
        System.out.print("Enter the number of nickels: ");
        float userN = scan.nextFloat();
        System.out.println("Enter the number of pennies: ");
        float userP = scan.nextFloat();

        System.out.println("You entered " + (int) userQ + " quarters.");
        float coinQ = (userQ * quarterWorth);
        System.out.println("You entered " + (int) userD + " dimes.");
        float coinD = (userD * dimeWorth);
        System.out.println("You entered " + (int) userN + " nickels.");
        float  coinN = (userN * nickelWorth);
        System.out.println("You entered " + (int) userP + " pennies.");
        float coinP = (userP * pennyWorth);
        float coins = coinQ + coinD + coinN + coinP;
        int dollars = (int) (coins);
        float cents = (((coins % 100) -dollars)*100);

        System.out.println('\n'+ "Your total is " + dollars + " dollars and " + new DecimalFormat("0").format(cents) + " cents.");

        scan.close();
    }
}
