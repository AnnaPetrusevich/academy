package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String type = sc.next();
		System.out.println("Введите переменную: ");

		switch (type) {
		case "int":
			int a = sc.nextInt();
			System.out.println("Остаток от деления: " + a / 2);
			break;
		case "double":
			double b = sc.nextDouble();
			System.out.println("Процент от числа: " + b * 0.7);
			break;
		case "float":
			float c = sc.nextFloat();
			System.out.println("Число в квадрате: " + c * c);
			break;
		case "char":
			char d = sc.next().charAt(0);
			System.out.println("Код символа: " + d);
			break;
		case "string":
			String e = sc.nextLine();
			System.out.println("Hello " + e);
			break;
		default:
			System.out.println("Unsupported type");
		}

		sc.close();

	}
}
