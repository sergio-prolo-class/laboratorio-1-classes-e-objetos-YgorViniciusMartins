package ifsc.poo;

public class Retangulo {
    float largura;
    float altura;


    public void setLargura(float largura){
        this.largura = largura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getArea(){
        return largura * altura;
    }

    public float getPerimetro(){
        return (largura * 2) + (altura * 2);
    }
}
