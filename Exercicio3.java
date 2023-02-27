package calculoDeNotas;

public class Exercicio3 {

    String nomeAluno;
    double provaUm;
    double provaDois;
    double projeto;
    double mediaDeProva;
    double notaDeProva;
    double notaDeProjeto;
    double mediaFinal;

    public Exercicio3(String nomeAluno, double provaUm, double provaDois, double projeto) {
        this.nomeAluno = nomeAluno;
        this.provaUm = provaUm;
        this.provaDois = provaDois;
        this.projeto = projeto;
    }

    void calculoDeMedia(){
        mediaDeProva = (provaUm + provaDois) / 2;
        notaDeProva = mediaDeProva * 0.7;
        notaDeProjeto = projeto * 0.3;
        mediaFinal = notaDeProva + notaDeProjeto;
    }

    void resultado(){
        if (mediaFinal >= 6.0){
            System.out.println("| Aluno: " + nomeAluno + " | Média Final: " + mediaFinal + " | Situação: Aprovado");
        } else if (mediaFinal < 6.0) {
            System.out.println("| Aluno: " + nomeAluno + " | Média Final: " + mediaFinal + " | Situação: Reprovado");
        }
    }
}

