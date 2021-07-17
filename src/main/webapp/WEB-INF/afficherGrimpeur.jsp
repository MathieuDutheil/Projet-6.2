
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Affichage d'un grimpeur</title>
    <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
</head>
<body>
<c:import url="/inc/menu.jsp" />
<div id="corps">
    <p class="info">${ form.resultat }</p>
    <p>Nom : <c:out value="${ grimpeur.nom }"/></p>
    <p>Prénom : <c:out value="${ grimpeur.prenom }"/></p>
    <p>Email : <c:out value="${ grimpeur.email }"/></p>
    <p>Mot de passe : <c:out value="${ grimpeur.motDePasse }"/></p>
    <p>Confirmation Mot de passe : <c:out value="${ grimpeur.confirmationMotDePasse }"/></p>
    <p>Numéro de téléphone : <c:out value="${ grimpeur.telephone }"/></p>
</div>
</body>
</html>