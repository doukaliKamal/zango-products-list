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

package ma.zango.productservice.model;

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
 * This class is a wrapper for {@link Product}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Product
 * @generated
 */
@ProviderType
public class ProductWrapper implements Product, ModelWrapper<Product> {
	public ProductWrapper(Product product) {
		_product = product;
	}

	@Override
	public Class<?> getModelClass() {
		return Product.class;
	}

	@Override
	public String getModelClassName() {
		return Product.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("productId", getProductId());
		attributes.put("lib", getLib());
		attributes.put("prix", getPrix());
		attributes.put("dateMiseVente", getDateMiseVente());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		String lib = (String)attributes.get("lib");

		if (lib != null) {
			setLib(lib);
		}

		String prix = (String)attributes.get("prix");

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
		return _product.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _product.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _product.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _product.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ma.zango.productservice.model.Product> toCacheModel() {
		return _product.toCacheModel();
	}

	@Override
	public int compareTo(ma.zango.productservice.model.Product product) {
		return _product.compareTo(product);
	}

	@Override
	public int hashCode() {
		return _product.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _product.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProductWrapper((Product)_product.clone());
	}

	/**
	* Returns the date mise vente of this product.
	*
	* @return the date mise vente of this product
	*/
	@Override
	public java.lang.String getDateMiseVente() {
		return _product.getDateMiseVente();
	}

	/**
	* Returns the lib of this product.
	*
	* @return the lib of this product
	*/
	@Override
	public java.lang.String getLib() {
		return _product.getLib();
	}

	/**
	* Returns the prix of this product.
	*
	* @return the prix of this product
	*/
	@Override
	public java.lang.String getPrix() {
		return _product.getPrix();
	}

	/**
	* Returns the uuid of this product.
	*
	* @return the uuid of this product
	*/
	@Override
	public java.lang.String getUuid() {
		return _product.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _product.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _product.toXmlString();
	}

	/**
	* Returns the primary key of this product.
	*
	* @return the primary key of this product
	*/
	@Override
	public long getPrimaryKey() {
		return _product.getPrimaryKey();
	}

	/**
	* Returns the product ID of this product.
	*
	* @return the product ID of this product
	*/
	@Override
	public long getProductId() {
		return _product.getProductId();
	}

	@Override
	public ma.zango.productservice.model.Product toEscapedModel() {
		return new ProductWrapper(_product.toEscapedModel());
	}

	@Override
	public ma.zango.productservice.model.Product toUnescapedModel() {
		return new ProductWrapper(_product.toUnescapedModel());
	}

	@Override
	public void persist() {
		_product.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_product.setCachedModel(cachedModel);
	}

	/**
	* Sets the date mise vente of this product.
	*
	* @param dateMiseVente the date mise vente of this product
	*/
	@Override
	public void setDateMiseVente(java.lang.String dateMiseVente) {
		_product.setDateMiseVente(dateMiseVente);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_product.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_product.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_product.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the lib of this product.
	*
	* @param lib the lib of this product
	*/
	@Override
	public void setLib(java.lang.String lib) {
		_product.setLib(lib);
	}

	@Override
	public void setNew(boolean n) {
		_product.setNew(n);
	}

	/**
	* Sets the primary key of this product.
	*
	* @param primaryKey the primary key of this product
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_product.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_product.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the prix of this product.
	*
	* @param prix the prix of this product
	*/
	@Override
	public void setPrix(java.lang.String prix) {
		_product.setPrix(prix);
	}

	/**
	* Sets the product ID of this product.
	*
	* @param productId the product ID of this product
	*/
	@Override
	public void setProductId(long productId) {
		_product.setProductId(productId);
	}

	/**
	* Sets the uuid of this product.
	*
	* @param uuid the uuid of this product
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_product.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductWrapper)) {
			return false;
		}

		ProductWrapper productWrapper = (ProductWrapper)obj;

		if (Objects.equals(_product, productWrapper._product)) {
			return true;
		}

		return false;
	}

	@Override
	public Product getWrappedModel() {
		return _product;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _product.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _product.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_product.resetOriginalValues();
	}

	private final Product _product;
}