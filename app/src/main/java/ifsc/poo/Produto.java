package ifsc.poo;

public class Produto {
    private String nome;
    private int preco; //Alternaria o preço para um float, pois como inteiro, não podemos especificar os centavos
    private int desconto;
    private String codigo_id;
    private static int qtd_produtos;
    private static final String[] registro = new String[51];
    private boolean inicializado = false;

    public Produto(String nome, int preco){
        if(!setNome(nome) || !setPreco(preco)){
            return;
        }
        setDesconto(0);
        qtd_produtos++;
        setId();
        adcionaRegistro();
        inicializado = true;
    }

    public boolean setNome (String nome){
        if(nome.isEmpty()){
            return false;
        }
        this.nome = nome;
        if(inicializado) {
            ajustaRegistro();
        }
        return true;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setPreco(int preco){
        if(preco < 0){
            return false;
        }
        this.preco = preco;
        if(inicializado) {
            ajustaRegistro();
        }
        return true;
    }

    public float getPreco(){
        return this.preco * (1 - (float) this.desconto/100);
    }

    public boolean setDesconto(int desconto){
        if(desconto < 0 || desconto > 100){
            return false;
        }
        this.desconto = desconto;
        if(inicializado) {
            ajustaRegistro();
        }
        return true;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return this.nome + ": de R$ " + String.format("%.2f" ,(float) this.preco) + " por APENAS R$ " + getPreco() + "!";
    }

    public int getQtdProdutos(){
        return qtd_produtos;
    }

    private void setId(){
        this.codigo_id = "CD:" + String.format("%03d", qtd_produtos / 1000) + "-" + String.format("%03d", qtd_produtos);
    }

    public String getCodigo(){
        return this.codigo_id;
    }

    private void adcionaRegistro(){
        if(registro[0] == null){
            registro[0] = "Código;Nome;Preço;Desconto";

        }
        registro[trataLimiteRegistro()] = this.codigo_id + ";" + this.nome + ";" + String.format("%.2f", getPreco()) + ";" + String.format("%d", this.desconto);
    }

    public String[] getRegistro(){
        return registro;
    }

    private void ajustaRegistro(){
        String[] elem_registro = registro[trataLimiteRegistro()].split(";");
        if(!this.nome.equals(elem_registro[1])){
            elem_registro[1] = this.nome;;
        } else if(!(String.format("%.2f", getPreco()).equals(elem_registro[2]))){
            elem_registro[2] = String.format("%.2f", getPreco());
        } else if(!String.format("%d", this.desconto).equals(elem_registro[3])) {
            elem_registro[3] = String.format("%d", this.desconto);
        } else {
            return;
        }
        registro[trataLimiteRegistro()] = elem_registro[0] + ";" + elem_registro[1] + ";" + elem_registro[2] + ";" + elem_registro[3];
    }

    private int trataLimiteRegistro(){
        int pos = qtd_produtos;
        while (pos > 50){
            pos -= 50;
        }
        return pos;
    }
}
