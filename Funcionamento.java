package controleDeVencimento;

import java.util.Scanner;

public class Funcionamento {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int diaA, mesA, anoA;
        int diaV, mesV, anoV;
        String nomeProduto;

        System.out.println("+-------------------------------------------+");
        System.out.println("|           Calculo de Vencimento           |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Qual o nome do produto");
        nomeProduto = sc.nextLine();

        CalculoDeVencimento nProduto = new CalculoDeVencimento(nomeProduto);
        nProduto.setNomeProduto(nomeProduto);

        System.out.println("+-------------------------------------------+");
        System.out.println("| Insira a data de hoje (dia/mês/ano)");
        do {
            System.out.println("| > Dia: ");
            diaA = sc.nextInt();
        } while (diaA > 31);
        System.out.println("+-------------------------------------------+");
        do {
            System.out.println("| > Mês: ");
            mesA = sc.nextInt();
        } while (mesA > 12);
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Ano: ");
        anoA = sc.nextInt();

        System.out.println("+-------------------------------------------+");
        System.out.println("| Insira a data de Vencimento (dia/mês/ano)");
        do {
            System.out.println("| > Dia: ");
            diaV = sc.nextInt();
        } while (diaV > 31);
        System.out.println("+-------------------------------------------+");
        do {
            System.out.println("| > Mês: ");
            mesV = sc.nextInt();
        } while (mesV > 12);
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Ano: ");
        anoV = sc.nextInt();
        System.out.println("+-------------------------------------------+");

        CalculoDeVencimento datas = new CalculoDeVencimento(diaA, mesA, anoA, diaV, mesV, anoV);
        datas.calculo(nomeProduto);

    }
}
