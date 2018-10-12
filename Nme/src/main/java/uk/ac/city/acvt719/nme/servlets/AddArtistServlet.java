package uk.ac.city.acvt719.nme.servlets;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.city.acvt719.nme.dao.NmeRepository;
import uk.ac.city.acvt719.nme.domain.Artist;

@WebServlet("/addArtist.html")
public class AddArtistServlet extends HttpServlet {
    
    private NmeRepository nr;
    
    @Inject
    public AddArtistServlet(NmeRepository nr){
        this.nr = nr;
    }
    
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        int artistId = Integer.parseInt(request.getParameter("artistId"));
        String artistName = request.getParameter("artistName");
        String genre = request.getParameter("genre");
        int sales = Integer.parseInt(request.getParameter("sales"));
        nr.addArtist(artistId, artistName, genre, sales);
        response.sendRedirect("addArtist.html");
        
    }
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        List<Artist> artists = nr.findAllArtists();
        
        request.setAttribute("artists", artists);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/addedArtist.jsp");
        requestDispatcher.forward(request, response);
        
    }
    
}