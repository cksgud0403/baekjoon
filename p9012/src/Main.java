import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt(); //T를 입력
		
		scanner.nextLine(); //\n를 제거
		
		
		for(int i = 0; i < T; i++) {
			
			String str = scanner.nextLine();
			
			Stack<Character> s = new Stack<Character>();
			
			for(int j = 0; j<str.length(); j++) {
				
				if(str.charAt(j) == '(') {
					s.push(str.charAt(j));
				}else { // )일 때
					if(s.isEmpty()) {
						s.push(str.charAt(j));
						break;
					}else {
						s.pop();
					}
					
				}
			}
			
			
			if(s.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
		
		scanner.close();
	}

}