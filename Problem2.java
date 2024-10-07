import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Player 1, enter your name: ");
            String nameOne = scan.nextLine();

            System.out.print("Enter your number: ");
            double numberOne = scan.nextDouble();
            scan.nextLine();   

            System.out.print("Player 2, enter your name: ");
            String nameTwo = scan.nextLine();

            System.out.print("Enter your number: ");
            double numberTwo = scan.nextDouble();
            scan.nextLine(); 
            
            if (numberOne > numberTwo) {
                System.out.println(nameOne + "'s number is bigger!");
            } else if (numberTwo > numberOne) {
                System.out.println(nameTwo + "'s number is bigger!");
            } else {
                System.out.println("The numbers are equal!");
            }
            
            scan.close();
    } 
} 