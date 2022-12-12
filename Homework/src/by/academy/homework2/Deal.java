/*Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. 
Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) 
из рассортированной колоды. 
Разделяйте пять карт, выданных каждому игроку, пустой строкой.*/

package by.academy.homework2;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Deal {
	public static void main(String[] args) {

		String[] suit = { "\u2666", "\u2660", "\u2663", "\u2665" };
		String[][] cardName = { { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" },
				{ "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" },
				{ "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" },
				{ "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" } };

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество игроков: ");
		int a = sc.nextInt();
		sc.close();

		if (a <= 1) {
			System.out.println("Количество игроков должно быть больше одного");
			return;
		}
		if (a > 10) {
			System.out.println("Количество игроков не должно превышать 10");
			return;
		}

		for (int i = 1; i <= a; i++) {
			System.out.println("У игрока № " + i + " выпали карты: ");

			int j = 0;
			Random m = new Random();
			Random k = new Random();

			while (j < 5) {
				int s = m.nextInt(4); //
				int c = k.nextInt(13);
				if (!Objects.equals(cardName[s][c], "")) {
					System.out.print(suit[s] + cardName[s][c] + " ");
					cardName[s][c] = "";
					j++;
				}

			}

			System.out.println();
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	