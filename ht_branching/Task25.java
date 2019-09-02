package by.oks.jb29_les03.ht_branching;

import java.util.Random;

/* Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », 
 * если температура в комнате превысила 60° С. */

public class Task25 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int temp = rand.nextInt(100);
		System.out.println("Температура в комнате = " + temp + "°С.");
		
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация!");
		}

	}

}
