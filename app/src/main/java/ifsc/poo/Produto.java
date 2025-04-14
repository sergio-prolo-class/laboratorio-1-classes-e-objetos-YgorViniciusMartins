package ifsc.poo;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;

    void setNome (String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setPreco(int preco){
        this.preco = preco;
    }

    float getPreco(){
        if(this.desconto != 0){
            float preco = this.preco * ((float)((1 - this.desconto) / 100));
            return preco;
        }
        return this.preco;
    }

    void setDesconto(int desconto){
        this.desconto = desconto;
    }

    int getDesconto(){
        return this.desconto;
    }
}
