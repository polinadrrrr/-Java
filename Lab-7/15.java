/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		final int SMS_PER_METER = 100;
        double weight, height, sm, m, bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вес в килограммах: ");
        weight = input.nextDouble();
        System.out.println("Введите рост в метрах: ");
        m = input.nextDouble();
        System.out.println("Введите рост в сантиметрах: ");
        sm = input.nextDouble();
        height = m * 100 + sm;
        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);
        System.out.println("BMI равно " +bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
		
	}
}
