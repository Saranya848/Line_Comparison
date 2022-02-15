package com.comparison;
import java.util.*;
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner c = new Scanner(System.in);
         
         System.out.println("Enter x1 value:");
         int x1 = c.nextInt();
        
         System.out.println("Enter y1 value:");
         int y1 = c.nextInt();
        
         System.out.println("Enter x2 value:");
         int x2 = c.nextInt();
        
         System.out.println("Enter y2 value:");
         int y2 = c.nextInt();
         c.close();
         int output1 = (int) Math.pow((x2-x1), 2);
         int output2 = (int) Math.pow((y2-y1), 2);
         int result = (int) Math.sqrt(output1+output2);
        
         System.out.println("Langth of line = "+result);
        
	}

}
