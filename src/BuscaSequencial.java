import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int posicao = -1;
        int encontrado = 0;

        for (int i = 0; i < elementos.length; i++){
            posicao++;
            if (numero == elementos[i]) {
                System.out.println("Achei " + elementos[i] + " na posicao " + posicao);
                encontrado = elementos[i];
            }
        }
        if(encontrado != numero){
            System.out.println("Numero " + numero + " nao encontrado!");
        }
    }
}