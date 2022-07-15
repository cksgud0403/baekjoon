import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		
		int T = scanner.nextInt(); //T를 입력
		
		scanner.nextLine(); //\n을 제거
		
		for(int i = 0; i < T; i++) {
			
			String str = scanner.nextLine();
			
			Stack<Character> s = new Stack<Character>();
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) != ' ') { // ' ' 이 아닌경우
					s.push(str.charAt(j)); // 스택에 push
				}else { // ' ' 이 맞으면
					while(!s.empty()) {
						stringBuilder.append(s.pop());
					}
					stringBuilder.append(' ');
				}
			}
			
			while(!s.empty()) { //스택을 비워서 마지막 단어를 출력한다.
				stringBuilder.append(s.pop());
			}
			
			System.out.println(stringBuilder.toString());
			
			stringBuilder.setLength(0);
		}
		scanner.close();
	}

}