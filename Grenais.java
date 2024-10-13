import java.io.IOException;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int inter = 0;
        int gremio = 0;
        int empates = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                inter+=1;
            }
            if(a<b){

            }
            
        }
    }
}

    if(a>b):
        inter+=1
    if(a<b):
        gremio+=1
    if(a==b):
        empates+=1
    c+=a
    d+=b
    e+=1
    print("Novo grenal (1-sim 2-nao)")
    n = int(input())
    if(n==1):
        continue
    if(n==2):
        break
print(f'{e} grenais')
print(f'Inter:{inter}')
print(f'Gremio:{gremio}')
print(f'Empates:{empates}')
if(inter>gremio):
    print("Inter venceu mais")
if(inter<gremio):
    print("Gremio venceu mais")
if(gremio==inter):
    print("Não houve vencedor")