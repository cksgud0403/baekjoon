import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		
		Stack<Character> s = new Stack<Character>();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ')') {
				s.push(str.charAt(i));
			}else { // )인 경우
				if(str.charAt(i-1) == '(') { // 1. 앞에 있는 문자가 ( 인 경우에는 레이저임.
					s.pop(); //따라서 (는 레이저의 시작을 의미하는 것이니 스택에서 pop 해주고
					count += s.size(); // 레이저의 시작을 의미하는 (을 제외하고 쇠막대기의 시작을 의미하는 (의 개수는 스택의 size 이므로 count 에 스택의 size만큼 더해준다.
				}else { //2. 앞에 있는 글자가 (이 아니라면 막대기의 끝을 의미하기 때문에
					s.pop(); // )의 짝인 (을 스택에서 pop 해주고
					count += 1; //count에 +1을 한다.
				}
				
			}
			
		}
		
		System.out.println(count);
		scanner.close();
	}

}
