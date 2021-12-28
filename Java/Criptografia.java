package uri;

import java.util.Scanner;

public class Main {

	
	static String encrypt(StringBuilder password) {
		
		//Step 1
		
		StringBuilder newPassword = new StringBuilder(password);
		
		for(int c = 0; c < newPassword.length(); c++) {
			
			
			char carac = newPassword.charAt(c);
			
			if((carac >= 'a' && carac <= 'z') || (carac >= 'A' && carac <= 'Z')) {
				
				newPassword.setCharAt(c, (char)((int)carac + 3));
			}
			
			

		}
		
		
		//Step 2
		newPassword = newPassword.reverse();
		
		//Step 3
		int middle = newPassword.length() / 2;
		
		for(int c = middle; c < newPassword.length(); c++) {
			
			char carac = newPassword.charAt(c);
			newPassword.setCharAt(c, (char)((int)carac - 1));
			
		}
		
		
		return newPassword.toString();
		
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfStrings = scan.nextInt();
		
		int lines = 0;
		
		
		while(lines < numberOfStrings) {
			
			StringBuilder password = new StringBuilder(readLine(scan));
			
			System.out.println(encrypt(password));
			lines++;
			
			
		}

	}

}
