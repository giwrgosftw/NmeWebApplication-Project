<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acvt719.nme.domain.Track" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Tracks by Album</h1>
        
        <p>Tracks on album <% out.print(request.getParameter("albumId")); %></p>
        
        <table>
            
            <%
                List<Track> tracks = (List<Track>) request.getAttribute("tracks");
                
                for (Track track : tracks){
                    out.println("<tr><td>"+track+"</td></tr>");
                }
            %>
            
        </table>
        <jsp:include page="footer.jsp" />
</html>