package enviarEEscreverUmaCarta;

import java.util.LinkedList;
import java.util.Stack;

public class GerarCarta {
    LinkedList<String> cartaPronta = new LinkedList<String>();
    private String remetente;
    private String destinatario;
    private String texto;

    private String novaLinha;

    public GerarCarta(String remetente, String destinatario, String texto) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.texto = texto;
    }

    void adicionarNovaLinha(String texto){
        cartaPronta.add(texto);
    }

    void apresentaCarta(String remetente, String destinatario){
        System.out.println("+--------------------------------------------+");
        System.out.println("| Olá Senhor(a) " + destinatario);
        for (String mostra : cartaPronta){
            System.out.println("| " + mostra);
        }
        System.out.println("| Atenciosamente, " + remetente);
        System.out.println("+--------------------------------------------+");
    }
}
