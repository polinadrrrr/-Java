/* Сальцова Полина, 02.11.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int buf;
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.print("Enter array: ");
		for (int i = 0; i < n; i++) {
		    array[i] = input.nextInt();
		}
		System.out.print("Array: ");
		for (int i = 0; i < n; i++) {
		    System.out.print(array[i] + " ");
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n ; j++) {
		        if (array[i] < array[j]) {
		        buf = array[i];
		        array[i] = array[j];
		        array[j] = buf;
		    }
		    }
		}
		System.out.print("\nResult: ");
		for (int i = 0; i < n; i++) {
		    System.out.print(array[i] + " ");
		}
		
	}
}