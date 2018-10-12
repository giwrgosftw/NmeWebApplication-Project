<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acvt719.nme.domain.Album" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>All Artists</h1>
        
        <table>
            
            <%
                List<Album> albums = (List<Album>) request.getAttribute("album");
                
                for (Album album : albums){
                    out.println("<tr><td>"+album+"</td></tr>");
                }
            %>
            
        </table>
        
        
        <jsp:include page="footer.jsp" />
</html>