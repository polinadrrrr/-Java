/*Сальцова Полина 22.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        boolean newLine = count % 10 == 0;
        System.out.println(newLine);
	}
}

