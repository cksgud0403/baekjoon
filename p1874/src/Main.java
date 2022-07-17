import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		
		int n = scanner.nextInt();
		
		int temp = 0; //마지막 숫자를 저장하기 위한 임시 변수
		
		boolean error = false;
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < n; i++) {
			
			int num = scanner.nextInt();
			
			if(num > temp) {
				for(int j = temp + 1; j <= num; j++) {
					s.push(j);
					stringBuilder.append("+\n");
				}
				temp = num;
			}
			
			if(s.peek() == num) {
				s.pop();
				stringBuilder.append("-\n");
			}else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.print(stringBuilder.toString());
		
		scanner.close();
	}

}
