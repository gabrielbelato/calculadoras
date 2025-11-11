import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1, n2;
        int opc;

        System.out.println("\n** Menu Calculadora **");
        System.out.println("* 1 - Adição         *");
        System.out.println("* 2 - Subtração      *");
        System.out.println("* 3 - Multiplicação  *");
        System.out.println("* 4 - Divisão        *");
        System.out.println("* 5 - Sair           *");
        System.out.println("***********************");
        System.out.print("Digite a opção desejada: ");
        opc = input.nextInt();

        if (opc < 1 || opc > 5) {
            System.out.println("\nOpção inválida!");
        } else if (opc == 5) {
            System.out.println("\nSaindo do sistema...");
        } else {
            System.out.print("\nDigite o primeiro número: ");
            n1 = input.nextFloat();
            System.out.print("Digite o segundo número: ");
            n2 = input.nextFloat();

            switch (opc) {
                case 1:
                    System.out.printf("\n%.1f + %.1f = %.1f\n", n1, n2, (n1 + n2));
                    break;
                case 2:
                    System.out.printf("\n%.1f - %.1f = %.1f\n", n1, n2, (n1 - n2));
                    break;
                case 3:
                    System.out.printf("\n%.1f x %.1f = %.1f\n", n1, n2, (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("\nErro: divisão por zero!");
                    } else {
                        System.out.printf("\n%.1f / %.1f = %.1f\n", n1, n2, (n1 / n2));
                    }
                    break;
            }
        }

        input.close();
    }
}
