import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();

        int maior = a;

        if (b > a) {
            maior = b;
        }

        System.out.println("O maior número entre " + a + " e " + b + " é: " + maior);

    }
}
