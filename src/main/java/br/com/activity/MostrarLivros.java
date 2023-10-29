package br.com.activity;

import br.com.activity.classes.Livro;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
@WebServlet(name = "Liro", urlPatterns = {"/livro"})
public class MostrarLivros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var livros = new ArrayList<Produto>();

        livros.add(new Livro("Moby Dick",152.92,9,"Ficção","Herman Melville",427));
        livros.add(new Livro("Coraline",41.99,10,"Ficção","Neil Gaiman",244));

        req.setAttribute("livros",livros);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/livro.jsp");
        dispatcher.forward(req,resp);
    }
}
