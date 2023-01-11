import java.util.Scanner;

public class PracticeDemo {
	static void splitString(String str) {
		StringBuffer alphabet = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer spl = new StringBuffer();
		int len = str.length();
		for(int i=0; i<len;i++) {
			if(Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
				alphabet.append(str.charAt(i));
			else
				spl.append(str.charAt(i));
		}
		System.out.println("The alphabet in the String is " + alphabet);
		System.out.println("The numeric in the String is " + num);
		System.out.println("The special character in the String is " + spl);
	}

	public static void main(String[] args) {
		while(true) {
			String str;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the String: ");
			str = s.nextLine();
			System.out.println("The entered string is " + str);
			splitString(str);
		}

	}

}
