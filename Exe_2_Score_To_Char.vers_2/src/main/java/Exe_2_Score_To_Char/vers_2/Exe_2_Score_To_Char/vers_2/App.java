package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

/**
 * Hello world!
 *
 */
public class App {
	public static String NumberToChar(int number) {
		if (number < 1)
			return "error";
		else if (1 <= number && number <= 49)
			return "F";
		else if (50 <= number && number <= 59)
			return "E";
		else if (60 <= number && number <= 69)
			return "D";
		else if (70 <= number && number <= 79)
			return "C";
		else if (80 <= number && number <= 89)
			return "B";
		else if (90 <= number && number <= 100)
			return "A";
		else if (number > 100)
			return "error";
		else
			return "error";
	}
}
