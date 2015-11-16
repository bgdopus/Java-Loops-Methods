import java.util.Scanner;


public class _2_3LetterWords {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		String letters = inputScanner.next();
		
		
		
		String lettersArray[] = letters.split("");
		
		
		
		
		for (int i = 0; i < lettersArray.length; i++) {
			for (int j = 0; j < lettersArray.length; j++) {
				for (int h = 0; h < lettersArray.length; h++) {
					System.out.println(lettersArray[i] + lettersArray[j] + lettersArray[h]);
				}
			}
		}
		inputScanner.close();
	}

}
