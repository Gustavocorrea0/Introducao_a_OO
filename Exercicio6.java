package tabuada;

public class Exercicio6 {
    long numeroDesejado;
    long numeroMaximo;

    public Exercicio6(long numeroDesejado, long numeroMaximo) {
        this.numeroDesejado = numeroDesejado;
        this.numeroMaximo = numeroMaximo;
    }

    void multiplicacao(){
        for (int i = 0; i < numeroMaximo; i++){
            System.out.println("| " + numeroDesejado + " x " + i + " = " + (i * numeroDesejado));
        }
    }
}
