package tabuada;

import java.util.Scanner;

public class FuncionamentoTabuada {
    static Scanner capturaDeDados = new Scanner(System.in);
    public static void main(String[] args) {
        long numero;
        long numeroMaximo;

        System.out.println("Gerador de Tabuada");

        System.out.println("Digite o número que deseja gerar a Tabuada: ");
        numero = capturaDeDados.nextLong();

        System.out.println("Digite a quantidade de vezes que o número sera multiplicado: ");
        numeroMaximo = capturaDeDados.nextLong();
        
        Exercicio6 multiplicar = new Exercicio6(numero, numeroMaximo);
        multiplicar.multiplicacao();

    }
}
