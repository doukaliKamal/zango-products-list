/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package zango.demo.core.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProduitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProduitLocalService
 * @generated
 */
@ProviderType
public class ProduitLocalServiceWrapper implements ProduitLocalService,
	ServiceWrapper<ProduitLocalService> {
	public ProduitLocalServiceWrapper(ProduitLocalService produitLocalService) {
		_produitLocalService = produitLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _produitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _produitLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _produitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _produitLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _produitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of produits.
	*
	* @return the number of produits
	*/
	@Override
	public int getProduitsCount() {
		return _produitLocalService.getProduitsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _produitLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _produitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zango.demo.core.model.impl.ProduitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _produitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zango.demo.core.model.impl.ProduitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _produitLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the produits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zango.demo.core.model.impl.ProduitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of produits
	* @param end the upper bound of the range of produits (not inclusive)
	* @return the range of produits
	*/
	@Override
	public java.util.List<zango.demo.core.model.Produit> getProduits(
		int start, int end) {
		return _produitLocalService.getProduits(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _produitLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _produitLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public void saveProduct(java.lang.String lib, long prix,
		java.sql.Date dateMiseVente) {
		_produitLocalService.saveProduct(lib, prix, dateMiseVente);
	}

	/**
	* Adds the produit to the database. Also notifies the appropriate model listeners.
	*
	* @param produit the produit
	* @return the produit that was added
	*/
	@Override
	public zango.demo.core.model.Produit addProduit(
		zango.demo.core.model.Produit produit) {
		return _produitLocalService.addProduit(produit);
	}

	/**
	* Creates a new produit with the primary key. Does not add the produit to the database.
	*
	* @param idProduit the primary key for the new produit
	* @return the new produit
	*/
	@Override
	public zango.demo.core.model.Produit createProduit(int idProduit) {
		return _produitLocalService.createProduit(idProduit);
	}

	/**
	* Deletes the produit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idProduit the primary key of the produit
	* @return the produit that was removed
	* @throws PortalException if a produit with the primary key could not be found
	*/
	@Override
	public zango.demo.core.model.Produit deleteProduit(int idProduit)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _produitLocalService.deleteProduit(idProduit);
	}

	/**
	* Deletes the produit from the database. Also notifies the appropriate model listeners.
	*
	* @param produit the produit
	* @return the produit that was removed
	*/
	@Override
	public zango.demo.core.model.Produit deleteProduit(
		zango.demo.core.model.Produit produit) {
		return _produitLocalService.deleteProduit(produit);
	}

	@Override
	public zango.demo.core.model.Produit fetchProduit(int idProduit) {
		return _produitLocalService.fetchProduit(idProduit);
	}

	/**
	* Returns the produit with the primary key.
	*
	* @param idProduit the primary key of the produit
	* @return the produit
	* @throws PortalException if a produit with the primary key could not be found
	*/
	@Override
	public zango.demo.core.model.Produit getProduit(int idProduit)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _produitLocalService.getProduit(idProduit);
	}

	/**
	* Updates the produit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param produit the produit
	* @return the produit that was updated
	*/
	@Override
	public zango.demo.core.model.Produit updateProduit(
		zango.demo.core.model.Produit produit) {
		return _produitLocalService.updateProduit(produit);
	}

	@Override
	public ProduitLocalService getWrappedService() {
		return _produitLocalService;
	}

	@Override
	public void setWrappedService(ProduitLocalService produitLocalService) {
		_produitLocalService = produitLocalService;
	}

	private ProduitLocalService _produitLocalService;
}