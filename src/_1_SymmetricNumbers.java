import java.util.Scanner;


public class _1_SymmetricNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		
		for (int i = start; i <= end; i++) {
			if ((i / 10 <= 9) && (i % 10 == 0)) {
				i++;
			}	
			if (i / 10 == 0) {
					
					System.out.println(i);
				}else {
					if (i / 10 == i % 10) {
						System.out.println(i);
					}else {
						if (i / 100 == i % 10) {
							System.out.println(i);
						}
					}
				}
			}
			
			
		input.close();

	}

}
