package br.com.activity;

import br.com.activity.classes.Eletronico;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
@WebServlet(name = "Eletros", urlPatterns = {"/eletronico"})
public class MostrarEletronicos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var eletros = new ArrayList<Produto>();

        eletros.add(new Eletronico("Forno Micro-ondas", 703.12, 5, "Tira Odor - 4L", "Eletrolux"));
        eletros.add(new Eletronico("Fritadeira Elétrica", 349, 6, "Sem Oléo", "Mondial"));
        eletros.add(new Eletronico("Liquidificador", 109, 7, "", "Mondial"));

        req.setAttribute("eletros",eletros);


        RequestDispatcher dispatcher = req.getRequestDispatcher("/eletronico.jsp");
        dispatcher.forward(req,resp);
    }
}
