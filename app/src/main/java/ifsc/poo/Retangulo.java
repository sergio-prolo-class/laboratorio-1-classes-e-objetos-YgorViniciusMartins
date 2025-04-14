package ifsc.poo;

public class Retangulo {
    float largura;
    float altura;


    public void setLargura(float largura){
        if(largura < 0) {
            return;
        }
        this.largura = largura;
    }

    public void setAltura(float altura){
        if(altura < 0){
            return;
        }
        this.altura = altura;
    }

    public float getArea(){
        return largura * altura;
    }

    public float getPerimetro(){
        return (largura * 2) + (altura * 2);
    }
}
