/*Сальцова Полина 30.11.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double dollars, rubles, exchange_rate;
		System.out.print("Enter dollar amount: ");
		dollars = input.nextDouble();
		System.out.print("Enter exchange rate: ");
		exchange_rate = input.nextDouble();
		rubles = dollars * exchange_rate;
		System.out.println("Ruble amount: " + (int)(rubles*100)/100.0 + " Rub");
	}
}
