// Write a program that converts Centigrade to Fahrenheit. (4)

import java.util.*;

class q8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double centigrade, fahrenheit;

        System.out.println("Enter the temperature in centigrade: ");
        centigrade = Double.parseDouble(s.nextLine());

        fahrenheit = (centigrade * (9/5.0)) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit );
        
        s.close();
    }
}