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

package zango.demo.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Produit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Produit
 * @generated
 */
@ProviderType
public class ProduitWrapper implements Produit, ModelWrapper<Produit> {
	public ProduitWrapper(Produit produit) {
		_produit = produit;
	}

	@Override
	public Class<?> getModelClass() {
		return Produit.class;
	}

	@Override
	public String getModelClassName() {
		return Produit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idProduit", getIdProduit());
		attributes.put("lib", getLib());
		attributes.put("prix", getPrix());
		attributes.put("dateMiseVente", getDateMiseVente());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idProduit = (Integer)attributes.get("idProduit");

		if (idProduit != null) {
			setIdProduit(idProduit);
		}

		String lib = (String)attributes.get("lib");

		if (lib != null) {
			setLib(lib);
		}

		Long prix = (Long)attributes.get("prix");

		if (prix != null) {
			setPrix(prix);
		}

		String dateMiseVente = (String)attributes.get("dateMiseVente");

		if (dateMiseVente != null) {
			setDateMiseVente(dateMiseVente);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _produit.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _produit.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _produit.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _produit.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<zango.demo.core.model.Produit> toCacheModel() {
		return _produit.toCacheModel();
	}

	@Override
	public int compareTo(zango.demo.core.model.Produit produit) {
		return _produit.compareTo(produit);
	}

	/**
	* Returns the id produit of this produit.
	*
	* @return the id produit of this produit
	*/
	@Override
	public int getIdProduit() {
		return _produit.getIdProduit();
	}

	/**
	* Returns the primary key of this produit.
	*
	* @return the primary key of this produit
	*/
	@Override
	public int getPrimaryKey() {
		return _produit.getPrimaryKey();
	}

	@Override
	public int hashCode() {
		return _produit.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _produit.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProduitWrapper((Produit)_produit.clone());
	}

	/**
	* Returns the date mise vente of this produit.
	*
	* @return the date mise vente of this produit
	*/
	@Override
	public java.lang.String getDateMiseVente() {
		return _produit.getDateMiseVente();
	}

	/**
	* Returns the lib of this produit.
	*
	* @return the lib of this produit
	*/
	@Override
	public java.lang.String getLib() {
		return _produit.getLib();
	}

	@Override
	public java.lang.String toString() {
		return _produit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _produit.toXmlString();
	}

	/**
	* Returns the prix of this produit.
	*
	* @return the prix of this produit
	*/
	@Override
	public long getPrix() {
		return _produit.getPrix();
	}

	@Override
	public void persist() {
		_produit.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_produit.setCachedModel(cachedModel);
	}

	/**
	* Sets the date mise vente of this produit.
	*
	* @param dateMiseVente the date mise vente of this produit
	*/
	@Override
	public void setDateMiseVente(java.lang.String dateMiseVente) {
		_produit.setDateMiseVente(dateMiseVente);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_produit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_produit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_produit.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id produit of this produit.
	*
	* @param idProduit the id produit of this produit
	*/
	@Override
	public void setIdProduit(int idProduit) {
		_produit.setIdProduit(idProduit);
	}

	/**
	* Sets the lib of this produit.
	*
	* @param lib the lib of this produit
	*/
	@Override
	public void setLib(java.lang.String lib) {
		_produit.setLib(lib);
	}

	@Override
	public void setNew(boolean n) {
		_produit.setNew(n);
	}

	/**
	* Sets the primary key of this produit.
	*
	* @param primaryKey the primary key of this produit
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_produit.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_produit.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the prix of this produit.
	*
	* @param prix the prix of this produit
	*/
	@Override
	public void setPrix(long prix) {
		_produit.setPrix(prix);
	}

	@Override
	public zango.demo.core.model.Produit toEscapedModel() {
		return new ProduitWrapper(_produit.toEscapedModel());
	}

	@Override
	public zango.demo.core.model.Produit toUnescapedModel() {
		return new ProduitWrapper(_produit.toUnescapedModel());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProduitWrapper)) {
			return false;
		}

		ProduitWrapper produitWrapper = (ProduitWrapper)obj;

		if (Objects.equals(_produit, produitWrapper._produit)) {
			return true;
		}

		return false;
	}

	@Override
	public Produit getWrappedModel() {
		return _produit;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _produit.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _produit.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_produit.resetOriginalValues();
	}

	private final Produit _produit;
}