/* Сальцова Полина, 02.11.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array = new int[3][5];
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 5; j++) {
		        array[i][j] = (int) ( Math.random() * 10 );
		    } 
		}
		System.out.print("Array: \n");
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 5; j++) {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}