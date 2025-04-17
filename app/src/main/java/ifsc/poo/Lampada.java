package ifsc.poo;

public class Lampada {
    private boolean ligada;
    private static int quantidade = 0;

    public Lampada(){
        quantidade++;
        this.ligada = false;
    }

    public Lampada(boolean estado){
        quantidade++;
        this.ligada = estado;
    }

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public boolean verEstado(){
        return this.ligada;
    }

    public int getQuantidade(){
        return quantidade;
    }
}

