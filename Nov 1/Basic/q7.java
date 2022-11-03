// Write a program that takes minutes as input, and display the total number of hours and minutes. (4)

import java.util.*;

class q7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int minutes, hours;

        System.out.println("Enter the minutes: ");
        minutes = s.nextInt();

        hours = minutes / 60;
        minutes = minutes % 60;

        System.out.print(hours + " Hours ");
        if (minutes !=0) {
            System.out.print( minutes + " Minutes");
        }
        System.out.println();
        s.close();
    }
}