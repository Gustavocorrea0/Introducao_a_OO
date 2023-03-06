package bicho;

import java.util.Scanner;

public class ControleDoBichinho {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int posicaoInicial;
        String instrucao;
        boolean controle = true;

        System.out.println("Qual a posição de inicial Bichinho: ");
        posicaoInicial = sc.nextInt();
        Bichinho inseto = new Bichinho(posicaoInicial);

        while (controle) {
            System.out.println("O que você deseja fazer? ");
            System.out.println(" M - Mover");
            System.out.println(" V - Virar");
            System.out.println(" S - Sair");
            instrucao = sc.nextLine();

            if (instrucao.equalsIgnoreCase("M") || instrucao.equalsIgnoreCase("MOVER")) {
                inseto.andar();
            } else if (instrucao.equalsIgnoreCase("V") || instrucao.equalsIgnoreCase("VIRAR")) {
                inseto.virar();
            } else if (instrucao.equalsIgnoreCase("S") || instrucao.equalsIgnoreCase("SAIR")) {
                System.out.println("Posição final " + inseto.getInseto());
                controle = false;
            } else {
                System.out.println("Não é possivel");
            }
        }
    }
}
