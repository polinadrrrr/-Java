/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        age = input.nextInt();
		System.out.println(age >= 16 ? "20": "10");
	}
}

