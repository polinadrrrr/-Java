/* Сальцова Полина, 20.09.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter m: ");
        	int m = input.nextInt();
		double res = 0, n = 1;
		for (int i = 1; i <= m; i++) {
		    if (i%2 == 0) {
		        res -= n/i;
		    }
		    else {
		        res += n/i;
		    }
		} 
		System.out.print("Result: " + res);
	}
}
