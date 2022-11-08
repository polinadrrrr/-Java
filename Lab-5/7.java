/* Сальцова Полина, 02.11.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string #1: ");
		String s1 = input.nextLine();
		System.out.print("Enter string #2: ");
		String s2 = input.nextLine();
		System.out.print("Enter string #3: ");
		String s3 = input.nextLine();
		System.out.print("Enter string #4: ");
		String s4 = input.nextLine();
		System.out.print("Enter string #5: ");
		String s5 = input.nextLine();
		if (s4.equals(s5)) {
			System.out.println(s1 + s2);
		}
		else {
			System.out.println(s1 + s3);
		}
	}
}
