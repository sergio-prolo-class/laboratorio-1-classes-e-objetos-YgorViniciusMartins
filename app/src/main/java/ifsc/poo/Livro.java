package ifsc.poo;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String[] generos = new String[2];
    private int paginas;
    private String[] titulos_cap = new String[30];
    private int[] pagina_cap = new int[30];

    public void setTitulo(String titulo){
        if(Objects.equals(titulo, "")){
            return;
        }
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        if(Objects.equals(autor, "")){
            return;
        }
        this.autor = autor;
    }

    public String getAutor(String autor){
        return this.autor;
    }

    public void setGeneros(String genero){
        if(Objects.equals(genero, "")){
            return;
        }
        this.generos[0] = genero;
    }
    public void setGeneros(String genero1, String genero2){
        if(Objects.equals(genero1, "")){
            return;
        }
        this.generos[0] = genero1;
        if(Objects.equals(genero2, "")){
            return;
        }
        this.generos[1] = genero2;
    }

    public void setPaginas(int paginas){
        if(paginas < 0){
            return;
        }
        this.paginas = paginas;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setTitulos_cap(String[] titulos_cap) {
        for(int i = 0; i < titulos_cap.length; i++){
            if(Objects.equals(titulos_cap[i], "")){
                return;
            }
        }
        this.titulos_cap = titulos_cap;
    }

    public String[] getTitulos_cap(){
        return this.titulos_cap;
    }

    public void setPagina_cap(int[] pagina_cap){
        for(int i = 0; i < pagina_cap.length; i++){
            if(pagina_cap[i] < 0){
                return;
            }
        }
        this.pagina_cap = pagina_cap;
    }

    public int[] getPagina_cap(){
        return this.pagina_cap;
    }
}
