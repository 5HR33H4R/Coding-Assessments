// Write a program to find the largest of three numbers. (3)

import java.util.*;

class q2 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int a, b, c;//, max = 6, min =0;
        
        System.out.println("Enter the 3 numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        // int n = 64;
        // while ( n > 0) {
        // a = (int)(Math.random()*(max-min+1)+min); 
        // b = (int)(Math.random()*(max-min+1)+min); 
        // c = (int)(Math.random()*(max-min+1)+min); 
        // System.out.print(a + "\t" + b + "\t" + c + "\t");
        
        if (a == b && a == c) {
            System.out.println("a, b, c are equal");
        }
        else if ( a == b ) {
            if (a > c) {
                System.out.println("a & b are the largest");
            }
            else {
                System.out.println("c is the largest");
            }
        }
        else if ( b == c ) {
            if (a > c) {
                System.out.println("a is the largest");
            }
            else {
                System.out.println("b & c are the largest");
            }
        }
        else if ( a == c ) {
            if (b > c) {
                System.out.println("b is the largest");
            }
            else {
                System.out.println("a & c are the largest");
            }
        }
        else if ( a > b && a > c) {
            System.out.println("a is the largest");
        }
        else if ( b > a && b > c) {
            System.out.println("b is the largest");
        }
        else {
            System.out.println("c is the largest");
        }
        //--n;
    //}
        s.close();
    }
}
