package aumentoDeSalario;

import java.util.Scanner;

public class Apresentacao {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        int id;
        double salario;
        int percentual;
        System.out.println("+-------------------------------------------+");
        System.out.println("|    Calculo de Aumento Salarial RH 2023    |");
        System.out.println("+-------------------------------------------+");
        System.out.println("|    Olá, Bem-Vindo ao Sistema de calculo   |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Qual o nome do colaborador(a): ");
        nome = sc.nextLine();
        System.out.println("| > Qual o id do colaborador(a)? ");
        id = sc.nextInt();

        Sistema cadastro = new Sistema(nome, id);
        System.out.println("+-------------------------------------------+");
        cadastro.cadastroDeFuncionario();

        System.out.println("+-------------------------------------------+");
        System.out.println("|              Dados Recebidos              |");
        System.out.println("+-------------------------------------------+");
        System.out.println("|         Vamos para a proxima parte        |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Qual o Salario do colaborador(a) " + nome + " :");
        salario = sc.nextDouble();
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Qual percentual de aumento: ");
        percentual = sc.nextInt();
        Sistema calculo = new Sistema(salario, percentual);
        calculo.setSalarioAtual(salario);
        calculo.calculoDeSalario(nome, id);

    }
}
