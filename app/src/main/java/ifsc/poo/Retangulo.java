package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;
    private static float maior_area = 0;
    private static float maior_perimetro = 0;
    private static Retangulo retangulo_maior_area;
    private static Retangulo retangulo_maior_perimetro;


    public Retangulo(float largura, float altura){
        if(!setLargura(largura)){
            this.largura = 1;
        }
        if(!setAltura(altura)){
            this.altura = 1;
        }
        maiorPerimetro();
        maiorArea();
    }


    public boolean setLargura(float largura){
        if(largura < 0) {
            return false;
        }
        this.largura = largura;
        maiorPerimetro();
        maiorArea();
        return true;
    }

    public boolean setAltura(float altura){
        if(altura < 0){
            return false;
        }
        this.altura = altura;
        maiorPerimetro();
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
        if(getArea() > maior_area){
            maior_area = getArea();
            retangulo_maior_area = new Retangulo(this.largura, this.altura);
        }
    }

    private void maiorPerimetro(){
        if(getPerimetro() > maior_perimetro){
            maior_perimetro = getPerimetro();
            retangulo_maior_perimetro = new Retangulo(this.largura, this.altura);
        }
    }

    public float getMaiorPerimetro(){
        return maior_perimetro;
    }

    public float getMaiorArea(){
        return maior_area;
    }

    public Retangulo maiorRetaguloPerimetro(){
        return retangulo_maior_perimetro;
    }

    public Retangulo maiorRetaguloArea(){
        return retangulo_maior_area;
    }
}
