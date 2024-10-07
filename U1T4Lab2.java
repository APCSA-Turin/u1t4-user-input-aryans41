import java.util.Scanner; 
public class U1T4Lab2 {
      public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please print only positive integers (no $ sign) for this program!");

        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!"); 

        System.out.print("What is your salary per hour?: ");
        int salary = scan.nextInt();
        scan.nextLine(); 
        int oneLess = salary;
        oneLess --;
        int oneMore = salary; 
        oneMore ++; 
        System.out.println("You can infrom your friends that you make $" + oneLess + "-$" + oneMore + " per hour." );

        System.out.print("How many hours did you work last week?: ");
        int totalHours = scan.nextInt();
        scan.nextLine();

        System.out.print("How much did you earn as tip?: " );
        int tip = scan.nextInt();
        scan.nextLine();

        System.out.print("How much money was deducted because of tax?: ");
        int tax = scan.nextInt();
        scan.nextLine();

        System.out.print("How many portions are you divding this into?: ");
        int portions = scan.nextInt();
        scan.nextLine(); 
    
        int totalPay = salary;
        totalPay *= totalHours;
        totalPay += tip; 
        totalPay -= tax; 
        int moneyPerPortion = totalPay; 
        moneyPerPortion /= portions; 
        int moneyremaining = totalPay; 
        moneyremaining %= portions; 
        System.err.println("The money per portion is $" + moneyPerPortion + " with $" + moneyremaining + " remaining.");
        
        System.out.print("How much money did you want remaining?: ");
        int wantedRemaining = scan.nextInt();
        scan.nextLine(); 
        if (moneyremaining > wantedRemaining) {
            System.err.println("You have more than enough money remaining!");
        } else if (moneyremaining < wantedRemaining) {
            System.out.println("You have less money remaining than excepted.");
        } else {
            System.err.println("You have exactly the right amount of money remaining.");
        }
    
        scan.close(); 
    }
} 
