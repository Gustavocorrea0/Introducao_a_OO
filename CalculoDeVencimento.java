package controleDeVencimento;

public class CalculoDeVencimento {
    // Atual

    private int diaAtual;
    private int mesAtual;
    private int anoAtual;

    // Vencimento

    private int diaVencimento;
    private int mesVencimento;
    private int anoVencimento;
    private String nomeProduto;

    public CalculoDeVencimento(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public CalculoDeVencimento(int diaAtual, int mesAtual, int anoAtual, int diaVencimento, int mesVencimento, int anoVencimento) {
        this.diaAtual = diaAtual;
        this.mesAtual = mesAtual;
        this.anoAtual = anoAtual;
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
        this.anoVencimento = anoVencimento;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    void calculo(String nomeProduto){
        System.out.println("| Informações ");
        System.out.println("| > Data de Hoje: " + diaAtual + "/" + mesAtual + "/" + anoAtual);
        System.out.println("| > Data de Vencimento: " + diaVencimento + "/" + mesVencimento + "/" + anoVencimento);
        System.out.println("| > Produto: " + nomeProduto);

        if (anoAtual == anoVencimento ){
            System.out.println("| > " + nomeProduto + " - Vence esse Ano");
        } else if (anoAtual < anoVencimento) {
            System.out.println("| > " + nomeProduto + " - Tudo Tranquilo");
        } else if (anoAtual > anoVencimento) {
            System.out.println("| > " + nomeProduto + " - Já Venceu");
        }
        System.out.println("+-------------------------------------------+");
    }
}
