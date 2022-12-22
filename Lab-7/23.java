/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, income, number, score, scale = 2, tax, i = -1, j = 1;
        x = input.nextInt();
        income = input.nextDouble();
        number = input.nextDouble();
        if(x > 10) {
            score = 3 * scale;
        }
        else {
            score = 4 * scale;
        }
        if(income > 10000) {
            tax = income * 0.2;
        }
        else {
            tax = income * 0.17 + 1000;
        }
        if(number % 3 == 0) {
            number = i;
        }
        else {
            number = j;
        }
		System.out.println("score: " + score + " tax: " + tax + " number: " + number);
	}
}


