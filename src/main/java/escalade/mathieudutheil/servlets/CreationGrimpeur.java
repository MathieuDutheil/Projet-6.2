package escalade.mathieudutheil.servlets;

import escalade.mathieudutheil.forms.CreationGrimpeurForm;
import escalade.mathieudutheil.model.Civilite;
import escalade.mathieudutheil.model.Grimpeur;
import escalade.mathieudutheil.service.CiviliteService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configurable
public class CreationGrimpeur  extends HttpServlet {
    private static final String ATTRIBUTE_GRIMPEUR = "grimpeur";
    public static final String ATTRIBUTE_FORM ="form";

    public static final String VUE_SUCCES = "/WEB-INF/afficherGrimpeur.jsp";
    public static final String VUE_FORM = "/WEB-INF/creerGrimpeur.jsp";

    @Autowired
    private CiviliteService civiliteService;

    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);

        ApplicationContext ac =(ApplicationContext) config.getServletContext().getAttribute("applicationContext");
    }

    public CreationGrimpeur() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // À la réception d'une requête GET, simple affichage du formulaire


        Iterable<Civilite> listeCivilites = civiliteService.getCivilites();
        // request.setAttribute("listeCivilites", listeCivilites);

        this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
    }

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CreationGrimpeurForm form = new CreationGrimpeurForm();
        Grimpeur grimpeur = form.creerGrimpeur(request);


        request.setAttribute(ATTRIBUTE_GRIMPEUR, grimpeur);
        request.setAttribute(ATTRIBUTE_FORM,form);

        if ( form.getErreurs().isEmpty() ) {
            /* Si aucune erreur, alors affichage de la fiche récapitulative */
            this.getServletContext().getRequestDispatcher( VUE_SUCCES ).forward( request, response );
        } else {
            /* Sinon, ré-affichage du formulaire de création avec les erreurs */
            this.getServletContext().getRequestDispatcher( VUE_FORM ).forward( request, response );
        }
    }


}