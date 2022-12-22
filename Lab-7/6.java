/*Сальцова Полина 21.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		double product = 1;
		if(x != 0) {
		    product *= x;
		}
		System.out.print("Result product: " + product);
	}
}
