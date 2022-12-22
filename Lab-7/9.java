/*Сальцова Полина 21.12.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);     //x=3, y=2 - ничего
		System.out.print("Enter x: ");              //x=3, y=4 - z=7
		int x = input.nextInt();                    //x=2, y=2 - x=2
		System.out.print("Enter y: ");
		int y = input.nextInt();
		int z = 0;
		if (x > 2) {
		    if (y > 2) {
		        z = x + y;
		        System.out.println("z = " + z);
		    }
		} 
		else
		System.out.println("x = " + x);
	}
}

