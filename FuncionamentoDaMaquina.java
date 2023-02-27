package controleDeMaquina;

import java.util.Scanner;

public class FuncionamentoDaMaquina {
    static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args){
        String ligar;
        int tempo;
        System.out.println("");
        System.out.println("Deseja Ligar a maquina(S para sim e N para não): ");
        ligar = capturaDeDados.nextLine();

        if (ligar.equalsIgnoreCase("S")){
            System.out.println("Por quanto tempo a maquina ficara ligada: ");
            tempo = capturaDeDados.nextInt();
        } else if (ligar.equalsIgnoreCase("N")) {

        }
    }
}
