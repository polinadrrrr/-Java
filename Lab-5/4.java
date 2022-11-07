/* Сальцова Полина, 02.11.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int sum_even = 0, sum_odd = 0;
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
		    if (array[i] % 2 == 0) {
		        sum_even += array[i];
		    }
		    else {
		        sum_odd += array[i];
		    }
		}
		System.out.println("\nSum of even numbers: " + sum_even);
		System.out.println("Sum of odd numbers: " + sum_odd);
	}
}