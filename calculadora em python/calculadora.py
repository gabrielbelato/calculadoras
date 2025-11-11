# Desenvolvido por Gabriel Belato

def calcular():
    print("\n*******************************")
    print("*      Menu Calculadora       *")
    print("*******************************")
    print("* 1 - Adição                 *")
    print("* 2 - Subtração              *")
    print("* 3 - Multiplicação          *")
    print("* 4 - Divisão                *")
    print("* 5 - Sair                   *")
    print("*******************************")

    try:
        opc = int(input("Digite a opção desejada: "))

        if opc < 1 or opc > 5:
            print("\nOpção Inválida!")
            return

        if opc == 5:
            print("\nSaindo do sistema.")
            return

        n1 = float(input("\nDigite o primeiro número: "))
        n2 = float(input("Digite o segundo número: "))

        if opc == 1:
            print(f"\n{n1:.2f} + {n2:.2f} = {n1 + n2:.2f}")
        elif opc == 2:
            print(f"\n{n1:.2f} - {n2:.2f} = {n1 - n2:.2f}")
        elif opc == 3:
            print(f"\n{n1:.2f} x {n2:.2f} = {n1 * n2:.2f}")
        elif opc == 4:
            if n2 == 0:
                print("\nErro: divisão por zero!")
            else:
                print(f"\n{n1:.2f} / {n2:.2f} = {n1 / n2:.2f}")

    except ValueError:
        print("\nErro: digite apenas números válidos.")

if __name__ == "__main__":
    calcular()
