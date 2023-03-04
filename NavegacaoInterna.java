package navegacao;

public class NavegacaoInterna {
    private String idioma;
    private String origem;
    private String destino;

    public NavegacaoInterna(String idioma) {
        this.idioma = idioma;
    }
    public NavegacaoInterna(String idioma,String origem, String destino) {
        this.idioma = idioma;
        this.origem = origem;
        this.destino = destino;
    }


    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    void configuracao() {
        if (idioma.equalsIgnoreCase("1")) {
            System.out.println("+--------------------------------------------+");
            System.out.println("|          Você selecionou o Português       |");
            System.out.println("+--------------------------------------------+");
        } else if (idioma.equalsIgnoreCase("2")) {
            System.out.println("+--------------------------------------------+");
            System.out.println("| Você selecionou o Baiaku de The Last of US |");
            System.out.println("+--------------------------------------------+");
        } else if (idioma.equalsIgnoreCase("3")) {
            System.out.println("+-------------------------------------------+");
            System.out.println("|  Você selecionou o Exterminador do Futuro |");
            System.out.println("+-------------------------------------------+");
        } else if (idioma.equalsIgnoreCase("4")){
            System.out.println("+-------------------------------------------+");
            System.out.println("|       Você selecionou o Silvio Santos     |");
            System.out.println("+-------------------------------------------+");
        } else if (idioma.equalsIgnoreCase("5")) {
            System.out.println("+-------------------------------------------+");
            System.out.println("|           Você selecionou o Chinês        |");
            System.out.println("+-------------------------------------------+");
        } else if (idioma.equalsIgnoreCase("6")){
            System.out.println("+-------------------------------------------+");
            System.out.println("|           Você selecionou o Inglês        |");
            System.out.println("+-------------------------------------------+");
        }
    }

    void Utilizacao() {
        if (idioma.equalsIgnoreCase("1")) {
            System.out.println(" Saindo de " + origem + " e indo para " + destino);
        } else if (idioma.equalsIgnoreCase("2")) {
            System.out.println(" krullllll krl " + origem + " rl krullll iii " + destino);
        } else if (idioma.equalsIgnoreCase("3")) {
            System.out.println(" Venha Comigo de " + origem + " a " + destino + " se quiser viver");
        } else if (idioma.equalsIgnoreCase("4")) {
            System.out.println(" Maoe, sa, sa, sa saindo de " + origem + " i, i, i, indo para" + destino);
        } else if (idioma.equalsIgnoreCase("5")) {
            System.out.println(" 離開 " + origem + " 即將 " + destino);
        } else if (idioma.equalsIgnoreCase("6")) {
            System.out.println(" Leaving " + origem + " and going to " + destino);
        }
    }
}
