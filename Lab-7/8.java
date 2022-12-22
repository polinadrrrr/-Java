/*Сальцова Полина 21.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter pulse rate: ");
		double pulse = input.nextDouble();
		if(pulse > 56) {
		    System.out.print("Keep training");
		}
		else {
		    System.out.print("Your heart is in perfect condition");
		}
	}
}
