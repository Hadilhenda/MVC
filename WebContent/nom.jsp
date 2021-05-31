<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>session</title>
</head>
<body style="background: orange";>
<h1>Bienvenue a votre session</h1>

<%if (request.getParameter("nom").equals("")) { %>
 <jsp:useBean id="auth" type="modele.authen" scope="session" />
<h4>Nom : 
 <jsp:getProperty name="auth" property="nom" /></h4>
<h4>prenom :
 <jsp:getProperty name="auth" property="prenom" /></h4>
 <%} else{ %>
 
 
 <h4>Nom :

 <%=request.getParameter("nom") %></h4>

 <h4>prenom :
<%=request.getParameter("prenom") %></h4>



 <%} %>
 <br><br><br>
 
 <form action="authentification.html">
 <input type="submit" value="Retour">

 </form>
 
</body>
</html>