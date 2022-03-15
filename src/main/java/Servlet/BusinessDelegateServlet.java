package Servlet;

import Business.BusinessDelegate;
import Business.BusinessLookup;
import Client.Client;
import Services.AmazonService;
import Services.NetflixService;
import Services.HBOMaxService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns="/plataform")
public class BusinessDelegateServlet extends HttpServlet {
    private String plataform;

    public BusinessDelegateServlet(){
        super();
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        plataform = request.getParameter("plataform");
        System.out.println(plataform);

        //preparação dos objetos
        var businessDelegate = new BusinessDelegate();
        var businessLookup = new BusinessLookup();
        businessLookup.setNetflixService(new NetflixService());
        businessLookup.setHBOMaxService(new HBOMaxService());
        businessLookup.setAmazonService(new AmazonService());
        businessDelegate.setLookupService(businessLookup);

        //Criação do cliente e escolha do business delegate - no caso escolhe o serviço de plataforma a ser utilizado
        Client client = new Client(businessDelegate);
        String res = client.choosePlataform(plataform);
        request.setAttribute("plataformChoosed", res);

        getServletContext().getRequestDispatcher("/plataformaEscolhida.jsp").forward(request, response);
    }
}
