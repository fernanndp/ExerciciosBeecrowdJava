import java.io.IOException;
import java.util.Scanner;

public class OddEvenOrCheating{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int j1 = sc.nextInt();
        int j2 = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();
        int resultado = ((j1+j2)%2);
    if(r == 0 && a == 1){
        System.out.println("Jogador 1 ganha!");
    }else if(r == 1 && a == 1){
        System.out.println("Jogador 2 ganha!");
    }else if(r == 1 && a == 0){
        System.out.println("Jogador 1 ganha!");
    }else{
        if(resultado == 0 && P == 1){
            System.out.println("Jogador 1 ganha!");
        }else if(resultado == 0 && P == 0){
            System.out.println("Jogador 2 ganha!");
        }else if(resultado != 0 && P == 0){
            System.out.println("Jogador 1 ganha!");
        }else if(resultado != 0 && P == 1){
            System.out.println("Jogador 2 ganha!");
        }
      }
    }

}