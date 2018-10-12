package uk.ac.city.acvt719.nme.servlets;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.city.acvt719.nme.dao.NmeRepository;


@WebServlet("/artistCount.html")
public class ArtistCountServlet extends HttpServlet {
    
    private NmeRepository nr;
    
    @Inject
    public ArtistCountServlet(NmeRepository nr){
        this.nr = nr;
    }
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws IOException, ServletException {
        
        int artistCount = nr.artistCount();
        
        request.setAttribute("artistCount", artistCount);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/artistCount.jsp");
        requestDispatcher.forward(request, response);
    }
}