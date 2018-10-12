<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acvt719.nme.domain.Artist" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>All Artists</h1>
        <table>
        <%
                List<Artist> artists = (List<Artist>) request.getAttribute("artists");
                
                for (Artist artist : artists){
                    out.println("<tr><td>"+artist+"</td></tr>");
                }
            %>
            </table>
        <jsp:include page="footer.jsp" />
</html>