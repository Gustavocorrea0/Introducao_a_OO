package navegacao;

import java.util.Scanner;

public class FuncionamentoNavegacao {
    static Scanner capturaDeDados = new Scanner(System.in);
    public static void main(String[] args) {
        String origem;
        String destino;
        String idiomaEscolhido;;
        System.out.println("Selecione Um idioma");
        System.out.println(" 1 - Português ");
        System.out.println(" 2 - Baiaku de The Last of US");
        System.out.println(" 3 - Exterminador do Futuro");
        System.out.println(" 4 - Silvio Santos");
        System.out.println(" 5 - Chines ");
        System.out.println(" 6 - Inglês");
        idiomaEscolhido = capturaDeDados.nextLine();

        NavegacaoInterna idiomaSelecionado = new NavegacaoInterna(idiomaEscolhido);

        idiomaSelecionado.configuracao();

        System.out.println("| > Qual sua origem: ");
        origem = capturaDeDados.nextLine();
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Qual seu destino: ");
        destino = capturaDeDados.nextLine();
        System.out.println("+-------------------------------------------+");
        NavegacaoInterna  origemDestino = new NavegacaoInterna(idiomaEscolhido,origem, destino);
        origemDestino.setIdioma(idiomaEscolhido);
        origemDestino.Utilizacao();
    }
}
