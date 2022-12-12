package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.print(result(str1, str2));
		sc.close();
	}

	private static boolean result (String str1, String str2) {

	      if (str1.length() != str2.length()) {
	    	  return false;
	      }
	      for (int i = 0; i < str1.length(); i++) {
	    	  String char1 = String.valueOf(str1.charAt(i));
          		if (!str2.contains(char1)) {
	                    return false;  
	            }
	       }
	      return true;
	}
	     
}      
	

