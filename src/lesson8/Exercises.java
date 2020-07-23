package lesson8;

import java.util.Arrays;

public class Exercises {
	public static final String		POEM = "заплутала радость где-то\n" + 
									   "мало солнца мало света\n" + 
									   "кружит осень листопадом\n" + 
									   "лужи сковывая хладом\n" + 
									   "\n" + 
									   "тихо стонет ветка где-то\n" + 
									   "лихо гонит тучи ветер\n" + 
									   "дольше дождик бьётся оземь\n" + 
									   "больше влаги просит озимь\n";
	
	public static final String		PLUSEXPRESSION = "25+7+41";

	public static final String[]	GENEALOGY = {
											"Авраам родил Исаака",
											"Авиуд родил Елиакима",
											"Авия родил Асу",
											"Азор родил Садока",
											"Аминадав родил Наасона",
											"Амон родил Иосию",
											"Арам родил Аминадава",
											"Аса родил Иосафата",
											"Ахаз родил Езекию",
											"Ахим родил Елиуда",
											"Вооз родил Овида",
											"Давид родил Соломона",
											"Езекия родил Манассию",
											"Елеазар родил Матфана",
											"Елиаким родил Азора",
											"Елиуд родил Елеазара",
											"Есром родил Арама",
											"Зоровавель родил Авиуда",
											"Иаков родил Иуду",
											"Иессей родил Давида",
											"Иехония родил Салафиила",
											"Иоафам родил Ахаза",
											"Иорам родил Озию",
											"Иосафат родил Иорама",
											"Иосия родил Иехонию",
											"Исаак родил Иакова",
											"Иуда родил Фареса",
											"Манассия родил Амона",
											"Наасон родил Салмона",
											"Овид родил Иессея",
											"Озия родил Иоафама",
											"Ровоам родил Авию",
											"Садок родил Ахима",
											"Салафиил родил Зоровавеля",
											"Салмон родил Вооза",
											"Соломон родил Ровоама",
											"Фарес родил Есрома"
										};
	
	public static void main(String[] args) {
		// TODO:
		// 1. Reverse words in every line of POEM
		// 2. Calculate frequency of every letter in the POEM and print it to console
		// 3. Calculate "value" of PLUSEXPRESSION and print it. Use Integer.valueOf(String) to convert
		// string representation of the integer into true integer value
		// 4. Restore right sequence in GENEALOGY (from 'Авраам').
		final StringBuilder	sb = new StringBuilder();
		
		for (String line : POEM.split("\n")) {
			final String[]	words = line.split(" ");
			
			for (int index = words.length-1; index >= 0; index--) {
				sb.append(words[index]).append(' ');
			}
			sb.append('\n');
		}
		System.err.println(sb);
		
		int [] count = new int[65536];
		
		for (char symbol : POEM.toCharArray()) {
			count[symbol]++;
		}
		
		for (int index = 0; index < count.length; index++) {
			if (count[index] != 0) {
				System.err.println(((char)index)+"="+count[index]);
			}
		}
		
		int	sum = 0;
		for (String item : PLUSEXPRESSION.split("\\+")) {
			sum += Integer.valueOf(item);
		}
		System.err.println("Sum="+sum);
		
		int	item = 0;
		
		sum = 0;
		for (char symbol : PLUSEXPRESSION.toCharArray()) {
			if (symbol >= '0' && symbol <= '9') {
				item = 10 * item + symbol - '0';
			}
			else {
				sum += item;
				item = 0;
			}
		}
		sum += item;
		System.err.println("Sum2="+sum);
		
		final String[] newGenealogy = new String[GENEALOGY.length];
		String	key = "Авраам";
		
		for (int index = 0; index < newGenealogy.length; index++) {
			for (int oldIndex = 0; oldIndex < GENEALOGY.length; oldIndex++) {
				if (GENEALOGY[oldIndex].startsWith(key)) {
					newGenealogy[index] = GENEALOGY[oldIndex];
					
					key = GENEALOGY[oldIndex].substring(GENEALOGY[oldIndex].lastIndexOf(' ')+1,GENEALOGY[oldIndex].length()-1);
					break;
				}
			}
		}
		System.err.println(Arrays.toString(newGenealogy));
	}

}
