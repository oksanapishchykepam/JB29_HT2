package by.oks.jb29_les03.ht_cycles;

import java.util.Scanner;

/*Проверить введенную пользователем строку на наличие недопустимых символов. 
 * В качестве первого символа допустимы только буквы и знак подчеркивания. 
 * Остальные символы могут быть буквами, цифрами и знаком подчеркивания.*/

public class Task32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите текст > ");
		String inputText = sc.next();
		String firstChar = inputText.substring(0, 1);
		String nextChar;
		
		if (!firstChar.matches("[a-zA-Z_]")) {
			System.out.println("В качестве первого символа допустимы только буквы и знак подчеркивания.");
		}else {
			for (int i = 1; i < inputText.length(); i ++) {
				nextChar = inputText.substring(i, i+1);
				if (!nextChar.matches("[0-9a-zA-Z_]")) {
					System.out.println("Вы ввели недопустимые символы. Допустимые символы: буквы, цифры и знак подчеркивания.");
					i = inputText.length();
				}
			}
		}
		
		System.out.println("Вы ввели: " + inputText);

	}

}
