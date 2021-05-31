<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Authentification</title>
</head>
<body style="background: #43cea2;  /* fallback for old browsers */
background: -webkit-linear-gradient(to right, #185a9d, #43cea2);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to right, #185a9d, #43cea2); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
">
<h1>Bienvenue à votre session</h1>
	  <jsp:useBean 	id="internaute"
					type="modele.Internaute"
					scope="session" />
<h2>Internaute de Login: 
	  <jsp:getProperty 	name="internaute"
						property="login" />					
</body>
</html>