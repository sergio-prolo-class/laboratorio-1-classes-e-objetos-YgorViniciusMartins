package ifsc.poo;

public class Navio {
    private int tamanho;
    private String pos;
    private String pos_atingidas;
    private String orientacao;
    private String aparencia;
    private boolean afundado;
    private static int qtd_navios;

    public Navio(int tamanho, int[] pos, String orientacao, String aparencia){
        if(!setTamanho(tamanho) || !setOrientacao(orientacao) || !setAparencia(aparencia) || !setPos(pos)){
            this.tamanho = 0;
            this.orientacao = "Inválida";
            this.aparencia = "*";
            this.pos = "-1,-1;";
            this.afundado = true;
        } else {
            this.afundado = false;
            this.pos_atingidas = "";
            qtd_navios++;
        }
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
        this.pos = "";
        if(getOrientacao().equals("Horizontal")){
            for (int i = 0; i < getTamanho(); i++) {
                if(pos[1] + i > 10){
                    return false;
                }
                this.pos += Integer.toString(pos[0]) + "," + Integer.toString(pos[1] + i) + ";";
            }
            return true;
        }

        if(getOrientacao().equals("Vertical")){
            for (int i = 0; i < getTamanho(); i++) {
                if(pos[0] + i > 10){
                    return false;
                }
                this.pos += Integer.toString(pos[0] + i) + "," + Integer.toString(pos[1]) + ";";
            }
            return true;
        }
        return false;
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

    public String getAparencia(){
        return this.aparencia;
    }

    public String getPos(){
        return this.pos;
    }

    public boolean foiAtingido(String pos){ //true se acertou, false caso contrário
        String[] posicoes_navio = this.pos.split(";");
        boolean atingido = false;
        this.pos = "";
        for (int i = 0; i < posicoes_navio.length; i++) {
            if(posicoes_navio[i].equals(pos)){
                this.recebeDano();
                pos_atingidas += posicoes_navio[i] + ";";
                atingido = true;

            } else {
                this.pos += posicoes_navio[i] + ";";
            }
        }
        return atingido;
    }

    private void recebeDano(){
        this.tamanho--;
        if(this.tamanho == 0){
            this.afundado = true;
            qtd_navios--;
        }
    }

    public boolean getAfundado(){
        return this.afundado;
    }

    public int getQtd_navios(){
        return qtd_navios;
    }

    public String getPos_atingidas(){
        return this.pos_atingidas;
    }
}
