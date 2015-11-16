import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


public class _6_RandomHands {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		
		char[] color = new char[] {'♣','♦','♥','♠'};
		String[] symbols = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		List<String> cards = new ArrayList<String>();
		
		for (int i = 0; i < symbols.length; i++) {
			for (int j = 0; j < color.length; j++) {
				cards.add(symbols[i] + color[j]);
				//System.out.print(symbols[i] + color[j]);
				
			}
			System.out.println();
		}
			
			
		
	
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < 5; j2++) {
					
					Random rand = new Random();
					int min = 0;
					int max = 51;
				    
				    int randomNum = rand.nextInt((max - min) + 1) + min;
	
					System.out.print(cards.get(randomNum));
				}
				System.out.println();
				
			}
			
		input.close();
		
		
			
		}
	}


