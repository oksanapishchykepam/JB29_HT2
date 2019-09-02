package by.oks.jb29_les03.ht_cycles;

/*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
(Таблицу ASCII).*/

public class Task26 {

	public static void main(String[] args) {
						
		for (int symbolNumber = 32; symbolNumber <= 1992; symbolNumber++) {
			
			char symbol = (char) symbolNumber;
			System.out.print(symbolNumber + " - " + symbol + " ");
			
			if (symbolNumber % 10 == 0) {
				System.out.println("");
			}
		}

	}

}
