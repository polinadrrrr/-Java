/*Сальцова Полина 21.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);     //x=2, y=3 - ничего
		System.out.print("Enter x: ");              //x=3, y=2 - x=3
		int x = input.nextInt();                    //x=3, y=3 - z=6
		System.out.print("Enter y: ");
		int y = input.nextInt();
		if (x > 2)
		if (y > 2) {
		    int z = x + y;
		    System.out.println("z = " + z);
		} 
		else
		System.out.println("x = " + x);
	}
}

