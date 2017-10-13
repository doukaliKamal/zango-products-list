<%@ include file="/init.jsp" %>

<%-- render() | Mode EL --%>
<style>
table {  
    color: #333; 
    font-family: Helvetica, Arial, sans-serif; 
    width: 640px; 
    border-collapse: 
    collapse; border-spacing: 0; 
}

td, th { border: 1px solid #CCC; height: 30px; }

th {  
    background: #F3F3F3;
    font-weight: bold;
}

td {  
    background: #FAFAFA; 
    text-align: center; 
}



</style>
<%-- render() | Boucle JSTL --%>
<h2>Liste des produits en vente :</h2>
<p>
    <table>
    <tr>  
    <th>Produit</th>
    <th>Prix</th>
    <th>Date de mise en vente</th>
	</tr>  
        
        <c:forEach items="${listeProduits}" var="produit">
           <tr>
            <td>${produit.lib}</td><td>${produit.prix}</td><td>${produit.dateMiseVente}</td>
            </tr>
        </c:forEach>
        
    </table>
</p>

<hr />
<hr />

<%-- Formulaires --%>
<p>
    Veuillez renseigner les informations du produit :
</p>

<portlet:actionURL name="processAction" var="processAction" />
<%-- processAction() | Formulaire HTML --%>
<form method="post" action="<%= processAction %>">

    <!--  Libelle produit-->
	<label for="lib">Libellé du produit : </label>
    <input id="lib" name="<portlet:namespace/>lib" type="text" />	
	
	<!--  prix-->
	<label for="prix">Prix : </label>
    <input id="prix" name="<portlet:namespace/>prix" type="text" />
	
	<!--  date de mise en vente-->
	<label for="dateMiseVente">Date de mise en vente : </label>
    <input id="dateMiseVente" name="<portlet:namespace/>dateMiseVente" type="text" />
	
	
    <input type="submit" value="Enregistrer" />
</form>

<hr />