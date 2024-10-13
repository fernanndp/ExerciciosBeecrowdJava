import java.io.IOException;
import java.util.Scanner;
public class PaperPlanes {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int P = sc.nextInt();
        int F = sc.nextInt();
        if((C*F) <= P){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
