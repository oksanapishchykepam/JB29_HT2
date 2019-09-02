package by.oks.jb29_les03.ht_branching;

/*Составить программу, реализующую эпизод применения компьютера в книжном магазине.
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; 
 * если сдачи не требуется, печатает на экране «спасибо»; 
 * если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; 
 * если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы. */

public class Task34 {

	public static void main(String[] args) {
		
		int price = Task14.enterNumber();
		int money = Task14.enterNumber();
		
		int dif = money - price;
		
		if (dif > 0) {
			System.out.println("Возьмите сдачу: " + dif);
		}
		else {
			if (dif < 0) {
				System.out.println("Пожалуйста, доплатите : " + (-dif));
			}
			else {
				System.out.println("Спасибо!");
			}
		}

	}

}
