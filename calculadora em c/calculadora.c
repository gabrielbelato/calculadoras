// Desenvolvido por Gabriel Belato

#include <stdio.h>

int main() {
    float n1, n2;
    int opc;

    printf("\n*******************************");
    printf("\n*      Menu Calculadora       *");
    printf("\n*******************************");
    printf("\n* 1 - Adição                 *");
    printf("\n* 2 - Subtração              *");
    printf("\n* 3 - Multiplicação          *");
    printf("\n* 4 - Divisão                *");
    printf("\n* 5 - Sair                   *");
    printf("\n*******************************");

    printf("\nDigite a opção desejada: ");
    scanf("%d", &opc);

    if (opc < 1 || opc > 5) {
        printf("\nOpção Inválida!\n");
    } 
    else if (opc == 5) {
        printf("\nSaindo do sistema.\n");
        return 0;
    } 
    else {
        printf("\nDigite o primeiro número: ");
        scanf("%f", &n1);
        printf("Digite o segundo número: ");
        scanf("%f", &n2);

        switch (opc) {
            case 1:
                printf("\n%.2f + %.2f = %.2f\n", n1, n2, n1 + n2);
                break;
            case 2:
                printf("\n%.2f - %.2f = %.2f\n", n1, n2, n1 - n2);
                break;
            case 3:
                printf("\n%.2f x %.2f = %.2f\n", n1, n2, n1 * n2);
                break;
            case 4:
                if (n2 == 0)
                    printf("\nErro: divisão por zero!\n");
                else
                    printf("\n%.2f / %.2f = %.2f\n", n1, n2, n1 / n2);
                break;
        }
    }

    return 0;
}