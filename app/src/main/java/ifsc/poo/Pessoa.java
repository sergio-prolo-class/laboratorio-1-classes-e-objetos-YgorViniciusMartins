package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String cpf){
        this.nome = "Sem nome";
        this.idade = -1;
        if(!setCpf(cpf)) {
            this.cpf = "123.456.789-00";
        }
    }

    public Pessoa(String cpf, String nome){
        if(!setNome(nome)){
            this.nome = "Sem nome";
        }
        this.idade = -1;
        if(!setCpf(cpf)) {
            this.cpf = "123.456.789-00";
        }
    }

    public Pessoa(String cpf, String nome, int idade){
        if(!setNome(nome)){
            this.nome = "Sem nome";
        }
        if(!setIdade(idade)){
            this.idade = -1;
        }
        if(!setCpf(cpf)){
            this.cpf = "123.456.789-00";
        }
    }

    public boolean setNome(String nome){
        if(nome.isEmpty()){
            return false;
        }
        this.nome = nome;
        return true;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setIdade(int idade){
        if(idade < 0){
            return false;
        }
        this.idade = idade;
        return true;
    }

    public int getIdade(){
        return this.idade;
    }

    public void felizAniversario(){
        this.idade++;
    }

    public boolean setCpf(String CPF){
        if(CPF.isEmpty()){
            return false;
        }
        this.cpf = CPF;
        return true;
    }

    public String getCpf() {
        return this.cpf;
    }
}
