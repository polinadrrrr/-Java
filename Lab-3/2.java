/* Сальцова Полина, 20.09.2022*/
public class Main
{
	public static void main(String[] args) {
		double res = 0, n = 1;
		for (int i = 1; i <= 10000; i++) {
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