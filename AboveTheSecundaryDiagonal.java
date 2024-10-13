import java.io.IOException;
import java.util.Scanner;

public class AboveTheSecundaryDiagonal {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        char O = sc.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		M[i][j] = sc.nextDouble();
        	}
        }
        
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		if (j < M.length-i-1) soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= ((M.length * M.length) - 12) / 2; 
    	System.out.println(String.format("%.1f", soma));
    }
	
}
