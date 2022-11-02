/* Сальцова Полина, 20.09.2022*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double res, c;
        int a,b;
        boolean trig = true;
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Integer solutions from  1 to 100:");
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                a = i;
                b = j;
                c = Math.pow(a, n) + Math.pow(b, n);
                res = Math.pow(c, 1.0/n);
                if (res == (int) res) {
                    System.out.println("a = " + a + ", b = " + b + ", result " + res);
                    trig = false;
                }
            }
        }
        if (trig) {
            System.out.println("Solutions not found");
        }
	}
}
