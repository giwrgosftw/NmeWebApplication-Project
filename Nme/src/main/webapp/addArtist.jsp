<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
        <h1>Add Artist</h1>
        
        <form action="addArtist.html" method="POST" >
            
            <label>Artist Id: <input type="text" name="artistId" /></label><br />
            <label>Artist Name: <input type="text" name="artistName" /></label><br />
            <label>Genre: <input type="text" name="genre" /></label><br />
            <label>Sales: <input type="text" name="sales" /></label><br />
            <input type="submit" value="Add Artist" />
                   
        </form>
       
        <jsp:include page="footer.jsp" />
</html>