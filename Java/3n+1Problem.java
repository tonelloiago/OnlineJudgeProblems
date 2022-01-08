package online;

import java.util.Scanner;

public class OnlineJudge {
	
	static int serie(int n, int count) {

		if(n > 1) {
			
			count = serie( (n % 2 == 0) ? n/2 : (3*n + 1), count);
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0, j = 0;
		int count = 1, bigger = 0;
		
		while(scan.hasNext()) {
			
			i = scan.nextInt();
			j = scan.nextInt();
			
			
			for(int k = Math.min(i, j); k <= Math.max(i, j); k++ ) {
				
				count = serie(k, count);
				bigger = (count > bigger) ? count : bigger;
				count = 1;
			
			}
			
			System.out.println(String.format("%d %d %d", i, j, bigger));
			bigger = 0;
	
		}		
	}
}
