package dsa.function.in.sit;

import java.util.Scanner;

public class Radius {
	   public static Double getCircumference(Double radius) {
	       return 2 * 3.14 * radius;
	   }
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      Double r = sc.nextDouble();
	      System.out.println(getCircumference(r));
	   }   
	}

