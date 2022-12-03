package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;

		System.out.println("Enter a purchase amount: ");
		x = sc.nextInt();

		System.out.println("Enter your age: ");
		y = sc.nextInt();

		sc.close();

		if (x < 100) {
			x = x * 5 / 100;
		} else if (x >= 100 && x < 200) {
			x = x * 7 / 100;
		} else if (y > 18 & x >= 200 && x < 300) {
			x = x * (12 + 4) / 100;
		} else if (y <= 18 & x >= 200 && x < 300) {
			x = x * 12 / 100;
		} else if (x >= 300 && x < 400) {
			x = x * 15 / 100;
		} else if (x >= 400) {
			x = x * 20 / 100;
		} else {
			x = x * 1;
		}

		System.out.println("Final prise is: " + x);

	}

}
