<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>client</title>
</head>
<body style="background: lightblue">
<jsp:useBean id="client" class="modele.client1" scope="session"/>
<h4>Nom :
 <jsp:getProperty name="client" property="nom" /></h4>
 <h4>prenom :
 <jsp:getProperty name="client" property="prenom" /></h4>
 <h4>adresse :
 <jsp:getProperty name="client" property="adresse" /></h4>
 <h4>Téléphone :
 <jsp:getProperty name="client" property="telephone" /></h4>
 <h4>Email :
 <jsp:getProperty name="client" property="email" /></h4>
 
 
</body>
</html>