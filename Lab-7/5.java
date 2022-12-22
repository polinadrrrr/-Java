/*Сальцова Полина 21.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter score: ");
		double score = input.nextDouble();
		System.out.print("Enter pay: ");
		double pay = input.nextDouble();
		if(score > 90) {
		    pay = pay + pay * 0.03;
		}
		System.out.print("Result pay: " + pay);
	}
}

