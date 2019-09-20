import java.util.Scanner;
public class Classwork5p2 {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Ask a question and the majic 8 ball will answer");
    String input = scan.nextLine();
    double response = (int)Math.random() * 7;
    if (response == 1) {
        System.out.println("Most Definately");
    } else if (response == 2) {
        System.out.println("Absolutely");
    } else if (response == 3) {
        System.out.println("Without a doubt");
    } else if (response == 4) {
        System.out.println("Probably");
    } else if (response == 5) {
        System.out.println("Sources say no");
    } else if (response == 6) {
        System.out.println("Don't count on it");
    } else {
        System.out.println("Answer unclear. ask a different question");
    }
}
}