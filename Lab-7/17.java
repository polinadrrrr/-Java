/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		System.out.println((num >= 1) && (num <=100));
		System.out.println(((num >= 1) && (num <=100)) || (num < 0));
	}
}

