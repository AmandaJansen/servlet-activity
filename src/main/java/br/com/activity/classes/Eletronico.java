package br.com.activity.classes;

import br.com.activity.Produto;

public class Eletronico extends Produto {

    public String descricao;
    public String marca;

    public Eletronico(String nome, double preco, int id, String descricao, String marca) {
        super(nome, preco, id);
        this.descricao = descricao;
        this.marca = marca;
    }

    @Override
    public String getDescricao() {
        return "Produto da marca: " + marca;
    }
}



