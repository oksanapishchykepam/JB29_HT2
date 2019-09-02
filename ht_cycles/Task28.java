package by.oks.jb29_les03.ht_cycles;

import java.util.Scanner;

/* Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
 * Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y = 0 при делении.
 * Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл).
 * В качестве символа прекращения вычислений принять ‘0’. */

public class Task28 {

	public static void main(String[] args) {
		
		System.out.println("Введите любой символ, кроме '0', чтобы продолжить");
		char value = enterChar();
		
		while(value != '0') {
			int number1 = Task06.enterNumber();
			int number2 = Task06.enterNumber();
			char operation = enterOperation();
			
			if (number2 == 0 && operation == '/') {
				System.out.println("Нельзя делить на 0. Пожалуйста введите еще раз значение для Y или другой знак операции!");
				
				number2 = Task06.enterNumber();
				operation = enterOperation();
			}
			
			float result = 0;
			
			switch(operation) {
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				result = number1 / number2;
				break;
			}
			
			System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
			
			System.out.println("Введите любой символ, кроме '0', чтобы продолжить");
			value = enterChar();
		}
		
		
	}
			
	public static char enterOperation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите знак операции (+, –, /, *) /n > ");
		
		while (!sc.hasNext("[+-/*]")) {
			System.out.println("Нет такого варианта. Попробуй еще раз! >");
			sc.next();
		}
		
		String text = sc.next();
		char operation = text.charAt(0);
		return operation;

	}
	
	public static char enterChar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" > ");
		
		String text = sc.next();
		char character = text.charAt(0);
		return character;

	}
	
}	
