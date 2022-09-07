import java.util.Scanner;

/*Class: CSE 1321L
        Section: WJ1
        Term: fall 2022
        Instructor: Nick Murphy
        Name: Takeria Thompson
        Lab#: 2
*/
public class Lab2A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scan.next();

        System.out.print("Enter another name: ");
        String anotherName = scan.next();

        System.out.print("Enter a verb: ");
        String verb = scan.next();

        System.out.print("Enter an adverb: ");
        String adverb = scan.next();
        System.out.print("Once upon a time, there was a person named "
                + name + " who had a child named "
                + anotherName + "." + " This child would " + verb + " " + adverb + " while singing to strangers.");

    }
}