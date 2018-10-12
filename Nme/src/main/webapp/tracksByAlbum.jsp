<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Find Tracks Taking Albums</h1>
        
        <form action="tracksByAlbum.html" method="GET" >
            <label>Enter Album Id: <input type="text" name="albumId" /></label>
            <br />
            <input type="submit" value="Find Tracks" />
        </form>
        
        <jsp:include page="footer.jsp" />
</html>