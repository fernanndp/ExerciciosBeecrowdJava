import java.io.IOException;
import java.util.Scanner;
public class Remaining2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<= 10001; i++){
            if(i%N == 2){
                System.out.println(i);
            }
        }
    }
}