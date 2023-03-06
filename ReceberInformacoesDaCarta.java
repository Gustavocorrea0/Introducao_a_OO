package enviarEEscreverUmaCarta;

import java.util.Scanner;

public class ReceberInformacoesDaCarta {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String remetente;
        String destinario;
        String linha;
        String addLinha;
        boolean continuar = true;

        System.out.println("+--------------------------------------------+");
        System.out.println("|              Envio de Email                |");
        System.out.println("+--------------------------------------------+");
        System.out.println("| > Remetente: ");
        remetente = sc.nextLine();
        System.out.println("+--------------------------------------------+");
        System.out.println("| > Destinario: ");
        destinario = sc.nextLine();
        System.out.println("+--------------------------------------------+");
        System.out.println("| > Digite a sua carta: ");
        linha = sc.nextLine();
        GerarCarta gerarCarta = new GerarCarta(remetente, destinario, linha);
        gerarCarta.adicionarNovaLinha(linha);

        while(continuar){
            System.out.println("+--------------------------------------------+");
            System.out.println("|    Deseja adicionar uma nova linha?      |");
            System.out.println("|       S para Sim                           |");
            System.out.println("|       N para Não                           |");
            System.out.println("| > ");
            addLinha = sc.nextLine();
            if (addLinha.equalsIgnoreCase("S")) {
                System.out.println("| > Digite:");
                linha = sc.nextLine();
                gerarCarta.adicionarNovaLinha(linha);
            } else if (addLinha.equalsIgnoreCase("N")){
                continuar = false;
                gerarCarta.apresentaCarta(remetente, destinario);
            } else {
                System.out.println("+--------------------------------------------+");
                System.out.println("|               Opção Inválida               |");
                System.out.println("+--------------------------------------------+");
            }
        }
    }
}
