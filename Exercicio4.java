package calculoDeAposentadoria;

public class Exercicio4 {
    String genero;
    int idade;
    int tempoDeContribuicao;
    int tempoMinimoMasculino = 35;
    int tempoMinimoFeminino = 30;
    int somaContribuicaoIdade;
    int somaNecessariaMasculino = 99;
    int somaNecessariaFeminino = 89;

    public Exercicio4(String genero,int idade, int tempoDeContribuicao) {
        this.genero = genero;
        this.idade = idade;
        this.tempoDeContribuicao = tempoDeContribuicao;
    }

    void calculoDeAposentadoriaMasculina(){
        if (tempoDeContribuicao < tempoMinimoMasculino){
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|           Você não pode se aposentar este ano            |");
            System.out.println("| Pois não possui o tempo mínino de contribuição (35 anos) |");
            System.out.println("+----------------------------------------------------------+");
            System.exit(0);
        }

        somaContribuicaoIdade = tempoDeContribuicao + idade;

        if (somaContribuicaoIdade == somaNecessariaMasculino){
            System.out.println("|               Você pode se aposentar este Ano            |");
        } else if (somaContribuicaoIdade < somaNecessariaMasculino) {
            System.out.println("|           Você não pode se aposentar este ano            |");
            System.out.println("|       Pois não possui o tempo necessário para tal        |");
        }
    }
    void calculoDeAposentadoriaFeminina(){
        if (tempoDeContribuicao < tempoMinimoFeminino){
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|           Você não pode se aposentar este ano            |");
            System.out.println("| Pois não possui o tempo mínino de contribuição (30 anos) |");
            System.out.println("+----------------------------------------------------------+");
            System.exit(0);
        }

        somaContribuicaoIdade = tempoDeContribuicao + idade;

        if (somaContribuicaoIdade == somaNecessariaFeminino){
            System.out.println("|               Você pode se aposentar este Ano            |");
        } else if (somaContribuicaoIdade < somaNecessariaFeminino) {
            System.out.println("|           Você não pode se aposentar este ano            |");
            System.out.println("|       Pois não possui o tempo necessário para tal        |");
        }
    }

}
