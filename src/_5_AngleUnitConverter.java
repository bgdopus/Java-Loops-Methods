import java.util.Scanner;

public class _5_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		
		String[] converterdArray = new String[n];
		
		for (int i = 0; i < n; i++) {
			String inputData = input.nextLine();
			String inputArray[] = inputData.split(" ");
			if ("deg".equals(inputArray[1])) {
				double radRes = Double.parseDouble(inputArray[0]) * (Math.PI/180);
				
				converterdArray[i] = String.format("%.6f", radRes) + " " +"rad";
			}else {
				
				double degRes = Double.parseDouble(inputArray[0]) * (180/Math.PI);
				converterdArray[i] = String.format("%.6f", degRes)  + " " +"deg";
			}
		}
		
		for (String con : converterdArray) {
			System.out.println(con);
		}
		
		input.close();
	}
}