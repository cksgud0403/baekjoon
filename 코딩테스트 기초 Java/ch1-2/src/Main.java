import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		String new_str = "";
		
		for (char s : str.toCharArray()) {
			if(Character.isUpperCase(s)) {
				new_str += Character.toLowerCase(s);
			}else if(Character.isLowerCase(s)) {
				new_str += Character.toUpperCase(s);
			}
		}
		
		System.out.println(new_str);
		
		scanner.close();
	}

}
