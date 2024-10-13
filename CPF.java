import java.io.IOException;
import java.util.Scanner;

public class CPF {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String STR = sc.next();
		String XXX= STR.substring(0, 3);
		String YYY = STR.substring(4, 7);
		String ZZZ = STR.substring(8, 11);
		String DD = STR.substring(12, 14);
		System.out.println(XXX);
		System.out.println(YYY);
		System.out.println(ZZZ);
		System.out.println(DD);
	}
}
	