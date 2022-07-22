import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		char ch = scanner.nextLine().charAt(0);
		
		int count = 0;
		
		str = str.toUpperCase();
		
		for(int i = 0; i<str.length(); i++) {
			if(Character.toUpperCase(ch) == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);
				
		scanner.close();
	}

}
