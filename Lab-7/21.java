/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, weight, height;
        age = input.nextInt();
        weight = input.nextInt();
        height = input.nextInt();
		System.out.println(age > 13 && age < 18);
		System.out.println(weight > 23 || height > 152);
		System.out.println(weight > 23 ^ height > 152);
	}
}
