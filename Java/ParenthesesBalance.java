import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	
	public static boolean parenthesisBalance(String word) {
		
		Stack<Character> charStack = new Stack<Character>();
		
		for(int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i);
			
			if(c == '(') {
				
				charStack.push(c);
			
			}	
			else if(c == ')') { 
				
				if(charStack.isEmpty()) 
					return false;
				else
					charStack.pop();
				
			}
		}
		
		if(charStack.isEmpty())
			return true;
		
		return false;
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String word = "";
		boolean match;
		
		
		while((word = reader.readLine()) != null) {
			
			match = parenthesisBalance(word);
			
			System.out.println(match == true ? "correct" : "incorrect");
		
		}
		
		
		
		
	
	}
	
	

}
