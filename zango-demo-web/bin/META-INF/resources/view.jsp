<%@page import="zango.demo.core.service.ProduitLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<p>
	<b><liferay-ui:message key="zango-demo-web.caption"/></b>
</p>


<portlet:renderURL var="addProductURL">
<portlet:param name="mvcPath" value="/addProduct.jsp"/>
</portlet:renderURL>


<aui:button onClick="${addProductURL}" value="Ajouter produit"></aui:button>

<liferay-ui:search-container delta="5" deltaConfigurable="true" emptyResultsMessage="no-products">
	<liferay-ui:search-container-results
		results="<%= ProduitLocalServiceUtil.getProduits(1, 5)      %>"
		total="<%= ProduitLocalServiceUtil.getProduitsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="zango.demo.core.model.ProduitModel"
		modelVar="aProduitModel"
	>
	
		<liferay-ui:search-container-column-text property="idProduit" />

		<liferay-ui:search-container-column-text property="lib" />

		<liferay-ui:search-container-column-text property="prix" />

		<liferay-ui:search-container-column-text property="dateMiseVente" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>



