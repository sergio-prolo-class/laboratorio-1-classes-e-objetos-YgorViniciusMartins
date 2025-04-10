package ifsc.poo;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        if(Objects.equals(nome, "")){
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void felizAniversario(){
        this.idade++;
    }
}
