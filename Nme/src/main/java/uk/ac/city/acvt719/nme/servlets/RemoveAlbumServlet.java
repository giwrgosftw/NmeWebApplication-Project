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
import uk.ac.city.acvt719.nme.domain.Album;



@WebServlet("/removeAlbum.html")
public class RemoveAlbumServlet extends HttpServlet{
    
    private NmeRepository nr;
    
    @Inject
    public RemoveAlbumServlet(NmeRepository nr){
        this.nr = nr;
    }
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {

        
        int albumId = Integer.parseInt(request.getParameter("albumId"));
        nr.removeAlbum(albumId);
        List<Album> album = nr.findAllAlbums();
        
        request.setAttribute("album", album);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/removedAlbum.jsp");
        requestDispatcher.forward(request, response);
        
        
    }
    
    
}