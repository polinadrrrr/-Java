/*Сальцова Полина 30.11.2022*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter sum: ");
    	int amount = input.nextInt();
    	int num_5000R, num_2000R, num_1000R, num_500R, num_200R, num_100R, num_50R;
    	num_5000R = amount / 5000;
    	amount %= 5000;
    	num_2000R = amount / 2000;
    	amount %= 2000;
    	num_1000R = amount / 1000;
    	amount %= 1000;
    	num_500R = amount / 500;
    	amount %= 500;
    	num_200R = amount / 200;
    	amount %= 200;
    	num_100R = amount / 100;
    	amount %= 100;
    	num_50R = amount / 50;
    	System.out.println("Your cash: " + num_5000R + " 5000 Rub, " + num_2000R + " 2000 Rub, "
    	+ num_1000R + " 1000 Rub, " + num_500R + " 500 Rub, " + num_200R + " 200 Rub, "
    	+ num_100R + " 100 Rub, " + num_50R + " 50 Rub, ");
    }