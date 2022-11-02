import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {

        int A, N;
        int soma = 0;

        Scanner scan =new Scanner(System.in);
        A = scan.nextInt();
        N = scan.nextInt();

        N = N/A;
        for(int i=1; i<=N; i++){
            soma = ((A*i)+soma);
        }
        System.out.println(soma);
    }
}
