package by.oks.jb29_les03.ht_branching;

/* Вычислить число и месяц в невисокосном году по номеру дня.*/

public class Task35 {

	public static void main(String[] args) {
		
		int dayNumber = Task14.enterNumber();
		int month = 1;
		
		while (dayNumber >= 31) {
						
			switch (month) {
				case 1: 
				case 3: 
				case 5: 
				case 7: 
				case 8: 
				case 10:
					dayNumber = dayNumber - 31;
					break;
				case 2:
					dayNumber = dayNumber - 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					dayNumber = dayNumber - 30;
					break;
			}
			month = month + 1;
		}
		
		if (dayNumber > 28) {
			if (month == 2) {
			month = month + 1;
			dayNumber = dayNumber - 28;
			}
			else {
				if (dayNumber == 31) {
					switch (month) {
					case 4:
					case 6:
					case 9:
					case 11:
						month = month + 1;
						dayNumber = dayNumber - 30;
					}
				}
			}
		}
		
		System.out.println("Месяц = " + month + ", день = " + dayNumber);
	}

}
