package by.oks.jb29_les03.ht_branching;

import java.util.Scanner;

/* Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом. */

public class Task23 {

	public static void main(String[] args) {
		
		 System.out.println("Введите месяц");
		 int month = Task14.enterNumber();
		 
		 System.out.println("Введите день");
		 int day = Task14.enterNumber();
		  
		switch(month) {
			  case 1:
			  case 3:
			  case 5:
			  case 7:
			  case 8:
			  case 10:
			  case 12:
				  if (day <= 31 && day > 0) {
					  System.out.println("Дата введена верно.");
				  }
				  else {
					  System.out.println("В этом месяце нет такого числа!");
				  }
				  break;
				  
			  case 4:
			  case 6:
			  case 9:
			  case 11:
				  if (day <= 30 && day > 0) {
					  System.out.println("Дата введена верно.");
				  }
				  else {
					  System.out.println("В этом месяце нет такого числа!");
				  }
				  break;
				  
			  case 2:
				  if (day <= 29 && day > 0) {
					  System.out.println("Дата введена верно.");
				  }
				  else {
					  System.out.println("В этом месяце нет такого числа!");
				  }
				  break;
				  
			  default:
				  System.out.println("Такого месяца не существует!");
			  }
		 }

	}
