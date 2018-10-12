<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Artist Count</h1>
        
        <p>The Nme offers 
            <%
                int artistCount = (Integer) request.getAttribute("artistCount");
                out.print(artistCount + " ");
            
            %>
            tracks.
        </p>
        
        <jsp:include page="footer.jsp" />
</html>