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

package zango.demo.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import zango.demo.core.model.Produit;
import zango.demo.core.model.ProduitModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Produit service. Represents a row in the &quot;ZANGO_Produit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ProduitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProduitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProduitImpl
 * @see Produit
 * @see ProduitModel
 * @generated
 */
@ProviderType
public class ProduitModelImpl extends BaseModelImpl<Produit>
	implements ProduitModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a produit model instance should use the {@link Produit} interface instead.
	 */
	public static final String TABLE_NAME = "ZANGO_Produit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "idProduit", Types.INTEGER },
			{ "lib", Types.VARCHAR },
			{ "prix", Types.BIGINT },
			{ "dateMiseVente", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("idProduit", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("lib", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("prix", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dateMiseVente", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table ZANGO_Produit (idProduit INTEGER not null primary key,lib VARCHAR(75) null,prix LONG,dateMiseVente VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table ZANGO_Produit";
	public static final String ORDER_BY_JPQL = " ORDER BY produit.idProduit ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ZANGO_Produit.idProduit ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(zango.demo.core.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.zango.demo.core.model.Produit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(zango.demo.core.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.zango.demo.core.model.Produit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(zango.demo.core.service.util.ServiceProps.get(
				"lock.expiration.time.zango.demo.core.model.Produit"));

	public ProduitModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _idProduit;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setIdProduit(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idProduit;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public int getIdProduit() {
		return _idProduit;
	}

	@Override
	public void setIdProduit(int idProduit) {
		_idProduit = idProduit;
	}

	@Override
	public String getLib() {
		if (_lib == null) {
			return StringPool.BLANK;
		}
		else {
			return _lib;
		}
	}

	@Override
	public void setLib(String lib) {
		_lib = lib;
	}

	@Override
	public long getPrix() {
		return _prix;
	}

	@Override
	public void setPrix(long prix) {
		_prix = prix;
	}

	@Override
	public String getDateMiseVente() {
		if (_dateMiseVente == null) {
			return StringPool.BLANK;
		}
		else {
			return _dateMiseVente;
		}
	}

	@Override
	public void setDateMiseVente(String dateMiseVente) {
		_dateMiseVente = dateMiseVente;
	}

	@Override
	public Produit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Produit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProduitImpl produitImpl = new ProduitImpl();

		produitImpl.setIdProduit(getIdProduit());
		produitImpl.setLib(getLib());
		produitImpl.setPrix(getPrix());
		produitImpl.setDateMiseVente(getDateMiseVente());

		produitImpl.resetOriginalValues();

		return produitImpl;
	}

	@Override
	public int compareTo(Produit produit) {
		int primaryKey = produit.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Produit)) {
			return false;
		}

		Produit produit = (Produit)obj;

		int primaryKey = produit.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Produit> toCacheModel() {
		ProduitCacheModel produitCacheModel = new ProduitCacheModel();

		produitCacheModel.idProduit = getIdProduit();

		produitCacheModel.lib = getLib();

		String lib = produitCacheModel.lib;

		if ((lib != null) && (lib.length() == 0)) {
			produitCacheModel.lib = null;
		}

		produitCacheModel.prix = getPrix();

		produitCacheModel.dateMiseVente = getDateMiseVente();

		String dateMiseVente = produitCacheModel.dateMiseVente;

		if ((dateMiseVente != null) && (dateMiseVente.length() == 0)) {
			produitCacheModel.dateMiseVente = null;
		}

		return produitCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idProduit=");
		sb.append(getIdProduit());
		sb.append(", lib=");
		sb.append(getLib());
		sb.append(", prix=");
		sb.append(getPrix());
		sb.append(", dateMiseVente=");
		sb.append(getDateMiseVente());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("zango.demo.core.model.Produit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idProduit</column-name><column-value><![CDATA[");
		sb.append(getIdProduit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lib</column-name><column-value><![CDATA[");
		sb.append(getLib());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prix</column-name><column-value><![CDATA[");
		sb.append(getPrix());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateMiseVente</column-name><column-value><![CDATA[");
		sb.append(getDateMiseVente());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Produit.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Produit.class
		};
	private int _idProduit;
	private String _lib;
	private long _prix;
	private String _dateMiseVente;
	private Produit _escapedModel;
}