import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
        String palavraContrario = new StringBuilder(palavra.toLowerCase()).reverse().toString();

        if (palavra.toLowerCase().equals(palavraContrario)) {
            System.out.println("A palavra " + palavra + " ao contrário se lê da mesma forma");
        } else {
            System.out.println("A palavra " + palavra + " ao contrário não se lê da mesma forma");
        }


    }
}
