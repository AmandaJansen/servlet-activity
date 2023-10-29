package br.com.activity;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class Produto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

    private String nome;
        private double preco;

        private int id;

        public Produto(String nome, double preco, int id) {
            this.nome = nome;
            this.preco = preco;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPreco() {
            return "Preço: " + "R$ " + preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", preco=" + preco +
                    ", id=" + id +
                    '}';
        }


    public abstract String getDescricao();
}



