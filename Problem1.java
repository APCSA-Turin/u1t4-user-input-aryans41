import java.util.Scanner;  
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Please enter your name: ");
        String name = scan.nextLine(); 
        System.out.println("Welcome " + name + "!");
        
        System.out.print("Please enter the first integer: ");
        int firstInteger = scan.nextInt(); 
        scan.nextLine(); 

        System.out.print("Please enter the second integer: ");
        int secondInteger = scan.nextInt (); 
        scan.nextLine(); 

        System.out.print("Please enter the third integer: ");
        int thirdInteger = scan.nextInt(); 
        scan.nextLine(); 
        
        double average = (firstInteger + secondInteger + thirdInteger)/ 3.0 ; 
        System.out.println("The average of " + firstInteger + ", " + secondInteger + ", and " + thirdInteger + " is " + average);
        
        scan.close();
    } 
} 
