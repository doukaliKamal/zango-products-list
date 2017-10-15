<%@ include file="init.jsp"%>

<portlet:actionURL name="addProduct" var="addProductURL">
</portlet:actionURL>

<aui:form action="${addProductURL}">
<aui:input name="lib" label="Libelle du produit : "></aui:input>
<aui:input name="prix" label="Prix : "></aui:input>
<aui:input name="dateMiseVente" label="Date de mise en vente : "></aui:input>
<aui:input name="" type="submit" value="add-product"></aui:input>
</aui:form>