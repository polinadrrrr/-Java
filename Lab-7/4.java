/*Сальцова Полина 21.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter y: ");
		byte x = 0, y = input.nextByte();
		if(y > 0) {
		    x = 1;
		}
		System.out.print("x = " + x);
	}
}
