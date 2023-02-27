package controleDeMaquina;

public class Maquina {
    String desejaLigar;
    boolean ligaEDesliga;
    int tempoLigado;

    public Maquina(String desejaLigar,boolean ligaEDesliga, int tempoLigado) {
        this.desejaLigar = desejaLigar;
        this.ligaEDesliga = ligaEDesliga;
        this.tempoLigado = tempoLigado;
    }


    // PAREI AQUI
    void ligarOuNao(){
        desejaLigar.equalsIgnoreCase("S");
    }
}
