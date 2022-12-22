/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        boolean t1 = (x > 0 && x < 10);
        boolean t2 = ((x > 0) && (x < 10));
        boolean t3 = (x > 0 || x < 10);
        boolean t4 = ((x > 0) || (x < 10));
        boolean t5 = (x > 0 || x < 10 && y < 0);
        boolean t6 = (x > 0 || (x < 10 && y < 0));
        System.out.println("1: " + t1 + ", " + t2);
        System.out.println("2: " + t3 + ", " + t4);
        System.out.println("3: " + t5 + ", " + t6);
	}
}

