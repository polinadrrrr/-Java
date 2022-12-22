/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		float x;
		x = input.nextFloat();
		System.out.println(Math.abs(x - 5) < 4.5);
		System.out.println(x - 5 >= 4.5);
	}
}

