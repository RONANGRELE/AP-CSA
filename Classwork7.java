import java.util.Scanner;
public class Classwork7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        System.out.println(canDrive(age));
    }
    public static double findDiff(int a, int b)
    {
        if ( a > b ) {
        return a - b;
        } else {
        return b - a;
        }
    }
    public static String canDrive(int age)
    {
        if (age >= 16)
            return "You can drive";
        else
            return "You can't drive quite yet";
    }
    public static String isCreator(String name)
    {
        if(name.equals("Ronan") || name.equals("ronan"))
            return "Hello creator";
        else
            return "intruder detected";
    }
    
}