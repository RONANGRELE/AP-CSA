import java.util.Scanner;
public class Classwork5p3 {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("How many sides on the die? (must be more than 3)");
int dieSides = scan.nextInt();
if (dieSides <= 3) {
System.out.println("I said it must be more than 3.");   
}
double randomRoll = (int)Math.random() * dieSides;
System.out.println("Your roll on a " + dieSides);
System.out.println("sided die came out to be a " + randomRoll);

}
}