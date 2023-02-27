package calculoDeAposentadoria;

import java.util.Scanner;

public class DemostraExercicio4 {

    static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        String generoMF;
        int idade;
        int tContribuicao;
        boolean controleDeGenero;

        do {
            System.out.println("+--------------------------+");
            System.out.println("|    Qual seu seu gênero:  |");
            System.out.println("|     M - Para Maculino    |");
            System.out.println("|     F - Para Feminino    |");
            System.out.println("| > ");
            generoMF = capturaDeDados.next();
            controleDeGenero = !generoMF.equalsIgnoreCase("M") && !generoMF.equalsIgnoreCase("F");

            if (controleDeGenero) {
                System.out.println("+--------------------------+");
                System.out.println("|      Opção inválida      |");
                System.out.println("+--------------------------+");
            }

        } while (controleDeGenero);

        if (generoMF.equalsIgnoreCase("M")) {

            System.out.println("Qual a sua idade: ");
            idade = capturaDeDados.nextInt();
            System.out.println("Qual a seu tempo de contribuição:");
            tContribuicao = capturaDeDados.nextInt();

            Exercicio4 masculino = new Exercicio4(generoMF, idade, tContribuicao);
            masculino.calculoDeAposentadoriaMasculina();

        } else if (generoMF.equalsIgnoreCase("F")) {

            System.out.println("Qual a sua idade: ");
            idade = capturaDeDados.nextInt();
            System.out.println("Qual a seu tempo de contribuição:");
            tContribuicao = capturaDeDados.nextInt();

            Exercicio4 feminino = new Exercicio4(generoMF, idade, tContribuicao);
            feminino.calculoDeAposentadoriaFeminina();

        }
    }
}
