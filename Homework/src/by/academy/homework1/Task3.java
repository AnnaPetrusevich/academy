package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int j;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число: ");

		i = sc.nextInt();

		sc.close();

		for (j = 1; j <= 10; j++) {

			System.out.println(i + "*" + j + "=" + j * i);

		}

	}
}
