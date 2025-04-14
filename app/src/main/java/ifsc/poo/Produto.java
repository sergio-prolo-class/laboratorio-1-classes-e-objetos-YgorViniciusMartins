package ifsc.poo;

import java.util.Objects;

public class Produto {
    private String nome;
    private int preco; //Alternaria o preço para um float, pois como inteiro, não podemos especificar os centavos
    private int desconto;

    public void setNome (String nome){
        if(Objects.equals(nome, "")){
            return;
        }
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(int preco){
        if(preco < 0){
            return;
        }
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco * (1 - (float) this.desconto/100);
    }

    public void setDesconto(int desconto){
        if(desconto < 0 || desconto > 100){
            return;
        }
        this.desconto = desconto;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return this.nome + ": de R$ " + String.format("%.2f" ,(float) this.preco) + " por APENAS R$ " + getPreco() + "!";
    }
}
