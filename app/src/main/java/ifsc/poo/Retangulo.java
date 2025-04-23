package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;
    private static float maior_area = 0;
    private static float menor_perimetro = 0;
    private static Retangulo retangulo_maior_area;
    private static Retangulo retangulo_menor_perimetro;


    public Retangulo(float largura, float altura){
        if(!setLargura(largura)){
            this.largura = 1;
        }
        if(!setAltura(altura)){
            this.altura = 1;
        }
        menorPerimetro();
        maiorArea();
    }


    public boolean setLargura(float largura){
        if(largura <= 0) {
            return false;
        }
        this.largura = largura;
        menorPerimetro();
        maiorArea();
        return true;
    }

    public boolean setAltura(float altura){
        if(altura <= 0){
            return false;
        }
        this.altura = altura;
        menorPerimetro();
        maiorArea();
        return true;
    }

    public float getLargura(){
        return this.largura;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getArea(){
        return largura * altura;
    }

    public float getPerimetro(){
        return (largura * 2) + (altura * 2);
    }

    private void maiorArea(){
        if(this.getArea() > maior_area || retangulo_maior_area == null){
            maior_area = this.getArea();
            retangulo_maior_area = this;
        }
    }

    private void menorPerimetro(){
        if(this.getPerimetro() < menor_perimetro || retangulo_menor_perimetro == null){
            menor_perimetro = this.getPerimetro();
            retangulo_menor_perimetro = this;
        }
    }

    public float getMaiorPerimetro(){
        return menor_perimetro;
    }

    public float getMaiorArea(){
        return maior_area;
    }

    public Retangulo menorRetaguloPerimetro(){
        return retangulo_menor_perimetro;
    }

    public Retangulo maiorRetaguloArea(){
        return retangulo_maior_area;
    }
}