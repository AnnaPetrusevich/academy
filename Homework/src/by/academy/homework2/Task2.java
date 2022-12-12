/*
		 * Ввести n слов с консоли. Найти слово, в котором число различных символов
		 * минимально. Если таких слов несколько, найти первое из них.
		 */
package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите слова: ");

		String[] words = scan.nextLine().split(" ");

		scan.close();

		int[] array = new int[words.length]; //123456...

		for (int i = 0; i < words.length; i++) { 
			char[] arr = words[i].toCharArray(); 
			int a = 0;
			for (int j = 0; j < arr.length; j++) { 
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] == arr[k] && arr[j] != '\u0000') {
						arr[k] = '\u0000';
						a++;
					}
				}
			}
			array[i] = words[i].length() - a;
		}

		int min = array[0];
		int keyW = 0;

		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				keyW = i;
			}
		}
		System.out.println(words[keyW] + " - слово с минимальным количеством различных символов");
	}
}

