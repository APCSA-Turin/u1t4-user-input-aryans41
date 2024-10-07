import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a 3-digit integer: ");
        int threeDigitInt = scan.nextInt();
        scan.nextLine();  

        int hundreds = threeDigitInt / 100;
        int tens = (threeDigitInt % 100)/ 10;
        int ones = (threeDigitInt % 100) % 10;

        System.out.println("The reverse of " + threeDigitInt + " is: " + ones + tens + hundreds);
        scan.close();
    }
}
