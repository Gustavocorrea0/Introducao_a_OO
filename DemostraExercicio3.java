package calculoDeNotas;

import java.util.Scanner;

public class DemostraExercicio3 {
    static Scanner capturaDeDados = new Scanner(System.in);
    public static void main(String[] args){
        String nomeAluno;
        double prova1;
        double prova2;
        double projeto;

        System.out.println("Qual o nome do Aluno");
        nomeAluno = capturaDeDados.nextLine();

        System.out.println("Digite a nota da prova 1 (De 0 a 10): ");
        prova1 = capturaDeDados.nextDouble();
        if (prova1 > 10 || prova1 < 0) {
            do {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|    A nota da primeira prova está em formato inválido    |");
                System.out.println("+---------------------------------------------------------+");
                System.out.println("| > Entre com a nota da primeira prova (de 0 a 10):");
                prova1 = capturaDeDados.nextInt();
            } while (prova1 > 10 || prova1 < 0);
        }

        System.out.println("Digite a nota da prova 2 (De 0 a 10): ");
        prova2 = capturaDeDados.nextDouble();
        if (prova2 > 10 || prova2 < 0) {
            do {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|    A nota da segunda prova está em formato inválido     |");
                System.out.println("+---------------------------------------------------------+");
                System.out.println("| > Entre com a nota da Segunda prova (de 0 a 10): ");
                prova2 = capturaDeDados.nextInt();
            } while (prova2 > 10 || prova2 < 0);
        }

        System.out.println("Digite a nota de Projeto (De 0 a 10): ");
        projeto = capturaDeDados.nextDouble();
        if (projeto > 10 || projeto < 0) {
            do {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|        A nota da Projeto está em formato inválido       |");
                System.out.println("+---------------------------------------------------------+");
                System.out.println("| > Entre com a nota do Projeto (de 0 a 10): ");
                projeto = capturaDeDados.nextInt();
            } while (projeto > 10 || projeto < 0);
        }

        Exercicio3 dadosAluno = new Exercicio3(nomeAluno, prova1, prova2, projeto);

        dadosAluno.calculoDeMedia();
        dadosAluno.resultado();
        
    }
}
