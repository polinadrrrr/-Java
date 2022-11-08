/* Сальцова Полина, 02.11.2022*/
import java.util.Scanner;
public class Main
{
	public static int Max(int[] inArray) { 
		int max = inArray[0], index_max = 0;
		for(int i = 0; i < inArray.length; i++) { 
			if(inArray[i] > max) { 
				max = inArray[i];
				index_max = i;
			} 
		}
		System.out.print("\nMaximum: " + max);
		return index_max;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int min, i_min = 0, i_max = 0, buf;
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
		for (int i = 0; i < n; i++) {
			if (array[i] < min) {
				min = array[i];
				i_min = i;
			}
		}
		i_max = Max(array);
		buf = array[i_min];
		array[i_min] = array[i_max];
		array[i_max] = buf;
		System.out.print("\nResult: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
