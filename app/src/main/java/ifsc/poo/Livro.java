package ifsc.poo;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String[] generos = new String[2];
    private int paginas;
    private String[] titulos_cap = new String[30];
    private int[] pagina_cap = new int[30];
    private int paginas_lidas = 0;
    private int qtd_cap = 0;
    private String capitulo_atual;

    public void setTitulo(String titulo) {
        if (Objects.equals(titulo, "")) {
            return;
        }
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        if (Objects.equals(autor, "")) {
            return;
        }
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    private boolean verificaGenero(String genero) {
        return switch (genero) {
            case "Fantasia", "Mistério", "Aventura", "Romance", "Terror", "Auto-ajuda", "Pedagógico" -> true;
            default -> false;
        };
    }

    private boolean verificaGenero(String genero1, String genero2) {
        boolean gen_1 = switch (genero1) {
            case "Fantasia", "Mistério", "Aventura", "Romance", "Terror", "Auto-ajuda", "Pedagógico" -> true;
            default -> false;
        };
        boolean gen_2 = switch (genero2) {
            case "Fantasia", "Mistério", "Aventura", "Romance", "Terror", "Auto-ajuda", "Pedagógico" -> true;
            default -> false;
        };
        return gen_1 && gen_2;
    }

    public void setGeneros(String genero) {
        if (!verificaGenero(genero)) {
            return;
        }
        this.generos[0] = genero;
    }

    public void setGeneros(String genero1, String genero2) {
        if (!verificaGenero(genero1, genero2)) {
            return;
        }
        this.generos[0] = genero1;
        this.generos[1] = genero2;
    }

    public String[] getGeneros() {
        return this.generos;
    }


    public void setPaginas(int paginas) {
        if (paginas < 0) {
            return;
        }
        this.paginas = paginas;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setTitulos_cap(String titulo_cap, int inicio_cap) {
        if (Objects.equals(titulo_cap, "")) {
            return;
        }
        this.titulos_cap[this.qtd_cap] = titulo_cap;
        setPagina_cap(inicio_cap);
        this.qtd_cap++;
    }

    public String[] getTitulos_cap() {
        return this.titulos_cap;
    }

    private void setPagina_cap(int pagina_cap) {
        if (pagina_cap < 0) {
            return;
        }
        this.pagina_cap[this.qtd_cap] = pagina_cap;
    }

    public int[] getPagina_cap(){
        return this.pagina_cap;
    }

    public int getQtd_cap(){
        return this.qtd_cap;
    }

    public void lerPaginas(int qtd){
        this.paginas_lidas += qtd;
    }

    public String lendoAtual(){
        for (int i = 0; i < this.qtd_cap || (i + 1) > this.qtd_cap; i++) {
            if(this.pagina_cap[i] <= this.paginas_lidas && this.pagina_cap[i + 1] > this.paginas_lidas){
                return  this.titulos_cap[i];
            }
        }
        return null;
    }

}
