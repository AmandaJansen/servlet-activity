package br.com.activity.classes;


import br.com.activity.Produto;

public class Livro extends Produto {
    public String genero;
    public String autor;

  public int paginas;

    public Livro(String nome, double preco, int id, String genero, String autor, int paginas) {
        super(nome, preco, id);
        this.genero = genero;
        this.autor = autor;
        this.paginas = paginas;
    }

    /*public static int getPaginas() {
        return paginas;
    }*/

    @Override
    public String getDescricao() {
        return "O gênero deste livro é:  " + genero;
    }

    public String getAutor(){
        return "Este livro tem como autor: " + autor;
    }

    public String mostrarPaginas(){
        return "O livro tem: " + paginas + " páginas";
    }



}
