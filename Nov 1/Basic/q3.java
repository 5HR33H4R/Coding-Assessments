//Write a program to print the integral quotient and remainder of a division.

import java.util.*;

class q3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dividend, divisor, quotient, remainder;
        System.out.println("Enter the dividend: ");
        dividend = s.nextInt();
        System.out.println("Enter the divisor: ");
        divisor = s.nextInt();

        if (divisor != 0) {
            if (dividend != 0) {
                quotient = dividend/divisor;
                remainder = dividend % divisor;
                System.out.println("Quotient: "+quotient);
                System.out.println("Remainder: "+remainder);
            }
            else {
                System.out.println("Quotient: 0");
                System.out.println("Remainder: 0");
            }
        }
        else {
            System.out.println("Divisor is Zero");
        }
        s.close();
    }
}