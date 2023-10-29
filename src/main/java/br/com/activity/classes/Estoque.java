package br.com.activity.classes;

import br.com.activity.Produto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Estoque", urlPatterns = {"/estoque"})

public class Estoque extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        var produtos = new ArrayList<Produto>();

        produtos.add(new Livro("Bird Box", 29.70, 1, "Suspense", "Josh Malerman", 273));
        produtos.add(new Livro("Chalk Man", 39.99, 2, "Mistério", "C.J.Tudor", 304));
        produtos.add(new Eletronico("Geladeira", 3299, 3, "", "Brastemp"));
        produtos.add(new Eletronico("Smart TV", 1851, 4, "", "Samsung"));

        req.setAttribute("produtos", produtos);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/estoque.jsp");
        dispatcher.forward(req, resp);

    }

}

