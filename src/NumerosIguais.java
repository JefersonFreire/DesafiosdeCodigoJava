import java.util.Scanner;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Informe o valor de a: ");
        a = scan.nextInt();

        System.out.println("Informe o valor de b: ");
        b = scan.nextInt();

        if(a == b)
            System.out.println("São iguais!");
        else
            System.out.println("Não são iguais!");
    }
}
