import java.util.Scanner;
//TODO: Imprima o somatório de N (utilize o método "somatorio").

public class ChamadaRecursiva {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        System.out.println(Somatorio.somatorio(num));
    }

}