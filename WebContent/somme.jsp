<?xml version="1.0" encoding="windows-1256" ?>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256" />
<title>Resultat</title>
</head>
<body style="background: #4DA0B0;  /* fallback for old browsers */
background: -webkit-linear-gradient(to right, #D39D38, #4DA0B0);  
background: linear-gradient(to right, #D39D38, #4DA0B0); 
">
<h1>Résulat</h1>
	  <jsp:useBean 	id="somme"
					type="modele.Sommation"
					scope="session" />
<h2>Nbre 1: </h2>
	  <jsp:getProperty 	name="somme"
						property="nbre1" />	
<h2>Nbre 2: </h2>
	  <jsp:getProperty 	name="somme"
						property="nbre2" />		
<h2>Résulat: </h2>
	  <%= session.getAttribute("resulat") %>									
</body>
</body>
</html>