package by.oks.jb29_les03.ht_branching;

/* Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. 
 * Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 
 * 9583, 1747 — доступны модули баз А, В, С; 
 * 3331, 7922 — доступны модули баз В, С; 
 * 9455, 8997 — доступен модуль базы С. */

public class Task33 {

	public static void main(String[] args) {
		
		System.out.println("Введите пароль");
		int password = Task14.enterNumber();
		
		if (password == 9583 || password == 1747) {
			System.out.println("У вас есть доступ к базам A, B и C");
		}
		if (password == 3331 || password == 7922) {
			System.out.println("У вас есть доступ к базам B и C");
		}
		if (password == 9455 || password == 8997) {
			System.out.println("У вас есть доступ к базе C");
		}

	}

}
