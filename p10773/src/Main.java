import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		
		Stack<Integer> s = new Stack<Integer>();
		
		int k = Integer.parseInt(scanner.nextLine()); // 정수 k가 받는다.
		
		for(int i = 0; i < k; i++) { // k의 정수를 받는다.
			
			int num = Integer.parseInt(scanner.nextLine());
			
			if(num == 0) { // 만약 입력 받은 정수가 0이면 최근에 들어간 숫자를 스택에서 꺼낸다.
				s.pop();
			}else { // 0이 아닌 숫자라면 스택에 넣는다.
				s.push(num);
			}
		}
		
		scanner.close();
		
		int sum = 0;
		
		while(!s.empty()) { // 스택 내에 숫자가 없을 때까지 반복한다.
			sum += s.pop(); //변수 sum에다가 꺼낸 숫자를 더한다.


		}
		
		System.out.println(sum);
	}

}