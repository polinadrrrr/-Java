/* Сальцова Полина, 02.11.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int min, max, i_min = 0, i_max = 0, buf;
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
		min = array[0];
		max = array[0];
		for (int i = 0; i < n; i++) {
		    if (array[i] < min) {
		        min = array[i];
		        i_min = i;
		    }
		    if (array[i] > max) {
		        max = array[i];
		        i_max = i;
		    }
		}
		buf = array[i_min];
		array[i_min] = array[i_max];
		array[i_max] = buf;
		System.out.print("\nResult: ");
		for (int i = 0; i < n; i++) {
		    System.out.print(array[i] + " ");
		}
		
	}
}