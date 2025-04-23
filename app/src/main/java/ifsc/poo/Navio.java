package ifsc.poo;

public class Navio {
    private int tamanho;
    private boolean[][] pos = new boolean[10][10];
    private String orientacao;
    private String aparencia;
    private int[][] pos_atingidas = new int[10][10];
    private boolean afundado;

    public Navio(int tamanho, int[] pos, String orientacao, String aparencia){
        setTamanho(tamanho);
        setOrientacao(orientacao);
        setAparencia(aparencia);
        setPos(pos);
    }

    public boolean setTamanho(int tamanho){
        if(tamanho < 0){
            return false;
        }
        this.tamanho = tamanho;
        return true;
    }

    public boolean setPos(int[] pos){
        if(pos[0] < 0 || pos[1] < 0 || pos[0] > 10 || pos[1] > 10){
            return false;
        }
        if(getOrientacao().equals("Horizontal")){
            for (int i = 0; i < getTamanho(); i++) {
                if(pos[1] + i > 10){
                    return false;
                }
                this.pos[pos[0]][pos[1] + i] = true;
            }
        }

        if(getOrientacao().equals("Vertical")){
            for (int i = 0; i < getTamanho(); i++) {
                if(pos[0] + i > 10){
                    return false;
                }
                this.pos[pos[0]][pos[1] + i] = true;
            }
        }
        return true;
    }
    
    public boolean setOrientacao(String orientacao){
        if(orientacao.equals("Horizontal") || orientacao.equals("Vertical")) {
            this.orientacao = orientacao;
            return true;
        }
        return false;
    }

    public boolean setAparencia(String aparencia){
        if(aparencia.length() != 1){
            return false;
        }
        this.aparencia = aparencia;
        return true;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public String getOrientacao(){
        return this.orientacao;
    }

    public  String getAparencia(){
        return this.aparencia;
    }
}
