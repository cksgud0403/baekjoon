import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i= 0; i < str.length(); i++) {
			if(str.charAt(i) != ')') {
				s.push(str.charAt(i));
			}else {
				while(s.pop() != '(');
			}
		}
		
		for(int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i));
		}
		
		scanner.close();
	}
}
