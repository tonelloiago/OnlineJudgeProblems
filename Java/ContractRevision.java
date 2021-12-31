import java.io.IOException;
import java.util.Scanner;


/*
https://www.beecrowd.com.br/judge/en/problems/view/1120">ContractRevision
*/

public class Main {


	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		String NStr = new String();
		String DStr = new String();
		boolean flag = true;
		
		
		while(flag) {
			
			NStr = scan.next();
			DStr = scan.next();

			if(!(NStr.equals("0") && DStr.equals("0"))) {			
				
				DStr = DStr.replaceAll(NStr, "");
				DStr = DStr.replaceFirst("0*", "");
			
				System.out.println(DStr.length() > 0 ? DStr : 0);
			
			}else {
				
				flag = false;
				
			}

		}
		

	}

}
