<%@ include file="/init.jsp" %>

<%-- render() | Mode EL --%>
<style>
table {  
    color: #333; /* Lighten up font color */
    font-family: Helvetica, Arial, sans-serif; /* Nicer font */
    width: 640px; 
    border-collapse: 
    collapse; border-spacing: 0; 
}

td, th { border: 1px solid #CCC; height: 30px; } /* Make cells a bit taller */

th {  
    background: #F3F3F3; /* Light grey background */
    font-weight: bold; /* Make sure they're bold */
}

td {  
    background: #FAFAFA; /* Lighter grey background */
    text-align: center; /* Center our text */
}



</style>
<p>
    Salut, je m'appelle ${name}, j'ai ${age} ans.
	
</p>

<%-- render() | Boucle JSTL --%>
<p>

Liste des produits en vente : 
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