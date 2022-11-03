//Write a program to read marks of three subjects and calculate the total and percentage. (3)

import java.util.*;

class q1 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        float m1, m2, m3, total, percent;
        
        System.out.println("Enter the marks of three subjects:");
        m1 = Float.parseFloat(s.nextLine());
        m2 = Float.parseFloat(s.nextLine());
        m3 = Float.parseFloat(s.nextLine());
        
        total = m1 + m2 + m3;
        percent= (total / 300) * 100;
        
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+percent+"%");
        
        s.close();
    }
}