package com.comparison;
import java.util.Scanner;
public class LineComparison {
	 public static int getLine(Scanner c) {
         System.out.println("Enter x1 Value");
         int x1 = c.nextInt();

         System.out.println("Enter y1 Value");
         int y1 = c.nextInt();

         System.out.println("Enter x2 Value");
         int x2 = c.nextInt();

         System.out.println("Enter y2 Value");
         int y2 = c.nextInt();

         int output1 = (int) Math.pow((x2 - x1), 2);
         int output2 = (int) Math.pow((y2 - y1), 2);
         int result = (int) Math.sqrt(output1 + output2);

         return result;      
 }

 public static void main(String[] args) {
         Scanner c = new Scanner(System.in);
         System.out.println("Please enter Line1 values");
         int length_line1 = getLine(c);
         System.out.println("Please enter Line2 values");
         int length_line2 = getLine(c);
         String output1=String.valueOf(length_line1);
         String output2=String.valueOf(length_line2);
         if(output1.equals(output2))
             System.out.println("Both lines are equal");

         else
             System.out.println("Both lines are not equal");

         c.close();
}
}