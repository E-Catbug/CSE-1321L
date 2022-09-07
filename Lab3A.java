import java.text.DecimalFormat;
import java.util.Scanner;

/*Class: CSE 1321L
        Section: WJ1
        Term: fall 2022
        Instructor: Nick Murphy
        Name: Takeria Thompson
        Lab#: 2
*/
public class Lab3A {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Amount owed: $");
                double owed = scan.nextDouble();
                System.out.print("APR:");
                double percent = scan.nextDouble() /100;
                double mpr = percent /12;
                System.out.print(" Monthly percentage rate: " + new DecimalFormat("0.000").format(mpr *100));
                double minPay = ((owed * percent) / 12);
                System.out.print(" Minimum payment: " + "$" + new DecimalFormat("0.00").format(minPay));
                scan.close();
            }
        }
