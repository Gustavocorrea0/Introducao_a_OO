package bicho;

public class Bichinho {
    private int inseto;
    private boolean mover;

    public Bichinho(int inseto) {
        this.inseto = inseto;
        this.mover = true;

    }

    void andar(){
        if (mover){
            inseto++;
        } else {
            inseto--;
        }
        System.out.println("Posição do bichinho: " + inseto);
    }

    void virar(){
        mover = !mover;
    }
    public int getInseto() {
        return inseto;
    }

}
