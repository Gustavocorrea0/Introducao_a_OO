package aumentoDeSalario;

public class Sistema {
    private String nomeFuncionario;
    private long idFuncionario;
    private double salarioAtual;
    private int percentualDeAumento;
    private double novoSalario;

    public Sistema(String nome, long idFuncionario) {
        this.nomeFuncionario = nome;
        this.idFuncionario = idFuncionario;
    }

    public Sistema(double salarioAtual, int percentualDeAumento) {
        this.salarioAtual = salarioAtual;
        this.percentualDeAumento = percentualDeAumento;
    }

    void cadastroDeFuncionario(){
        System.out.println("| > Nome: " + nomeFuncionario + " | ID: " + idFuncionario);
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    void calculoDeSalario(String nomeFuncionario, long idFuncionario){
        novoSalario = salarioAtual * percentualDeAumento / 100 ;
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Estas são as informações                |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| > Funcinario: " + nomeFuncionario);
        System.out.println("| > Id: " + idFuncionario);
        System.out.println("| > Salario Antes do reajuste: R$" + salarioAtual);
        System.out.println("| > Novo Salario: R$" + (novoSalario + salarioAtual) );
        System.out.println("+-------------------------------------------+");
        System.out.println("|    Obrigado por utilizar nosso Sistema    |");
        System.out.println("+-------------------------------------------+");
        System.out.println("|             Tenha um Bom Dia :)           |");
    }
}
