package by.oks.jb29_les03.ht_branching;

import java.util.Scanner;

/* Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!». */

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М >");
		
		while (!sc.hasNext("[ДдМм]")) {
			System.out.println("Нет такого варианта. Попробуй еще раз! >");
			sc.next();
		}
		
		String text = sc.next();
		char gender = text.charAt(0);
		
		if (gender == 'Д' || gender == 'д') {
			System.out.println("Мне нравятся мальчики!");	
		}
		else {
			System.out.println("Мне нравятся девочки!");
		}
		

	}

}
