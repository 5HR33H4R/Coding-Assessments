// Write a program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies. 

import java.util.*;

class q6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x, y;

        System.out.println("Enter X: ");
        x = s.nextInt();
        System.out.println("Enter Y: ");
        y = s.nextInt();

        if (x > 0) {
            if ( y > 0 ) {
                System.out.println("The point lies in the 1st Quadrant");
            }
            else if ( y < 0) {
                System.out.println("The point lies in the 4th Quadrant");
            }
            else {
                System.out.println("The point lies on X-axis");
            }
        }
        else if (x < 0) {
            if ( y > 0 ) {
                System.out.println("The point lies in the 2nd Quadrant");
            }
            else if ( y < 0) {
                System.out.println("The point lies in the 3rd Quadrant");
            }
            else {
                System.out.println("The point lies on X-axis");
            }
        }
        else {
            if (y != 0) {
                System.out.println("The point lies on Y-axis");
            }
            else {
                System.out.println("The point lies in the origin");
            }
        }
        
        s.close();
    }
}