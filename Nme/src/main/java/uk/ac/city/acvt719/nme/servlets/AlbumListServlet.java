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


@WebServlet("/albumList.html")
public class AlbumListServlet extends HttpServlet {
    
    private NmeRepository nr;
    
    @Inject
    public AlbumListServlet(NmeRepository nr){
        this.nr = nr;
    }
    
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws IOException, ServletException {
        
        List<Album> albums = nr.findAllAlbums();
        
        request.setAttribute("albums", albums);
        
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = 
                servletContext.getRequestDispatcher("/albumList.jsp");
        requestDispatcher.forward(request, response);
        
    }
    
    
}