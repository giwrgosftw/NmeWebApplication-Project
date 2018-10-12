<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Remove Album</h1>
        
        <form action="removeAlbum.html" method="GET">
            <label>Album Id: <input type="text" name="albumId" /></label>
            <br />
            <input type="submit" value="Remove Album" />
        </form>
        
        <jsp:include page="footer.jsp" />
</html>