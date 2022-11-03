// Write a program to check whether a triangle can be formed by the given value for the angles.

import java.util.*;

class q5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        float angle1, angle2, angle3, sum;

        System.out.println("Enter the Angles: ");
        angle1 = Float.parseFloat(s.nextLine());
        angle2 = Float.parseFloat(s.nextLine());
        angle3 = Float.parseFloat(s.nextLine());

        sum = angle1 + angle2 + angle3;

        if (sum == 180.0) {
            System.out.println("Triangle can be formed");
        }
        else {
            System.out.println("Triangle can't be formed");
        }
        s.close();
    }
}
