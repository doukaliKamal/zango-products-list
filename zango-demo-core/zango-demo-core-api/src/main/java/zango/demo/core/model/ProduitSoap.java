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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ProduitSoap implements Serializable {
	public static ProduitSoap toSoapModel(Produit model) {
		ProduitSoap soapModel = new ProduitSoap();

		soapModel.setIdProduit(model.getIdProduit());
		soapModel.setLib(model.getLib());
		soapModel.setPrix(model.getPrix());
		soapModel.setDateMiseVente(model.getDateMiseVente());

		return soapModel;
	}

	public static ProduitSoap[] toSoapModels(Produit[] models) {
		ProduitSoap[] soapModels = new ProduitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProduitSoap[][] toSoapModels(Produit[][] models) {
		ProduitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProduitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProduitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProduitSoap[] toSoapModels(List<Produit> models) {
		List<ProduitSoap> soapModels = new ArrayList<ProduitSoap>(models.size());

		for (Produit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProduitSoap[soapModels.size()]);
	}

	public ProduitSoap() {
	}

	public int getPrimaryKey() {
		return _idProduit;
	}

	public void setPrimaryKey(int pk) {
		setIdProduit(pk);
	}

	public int getIdProduit() {
		return _idProduit;
	}

	public void setIdProduit(int idProduit) {
		_idProduit = idProduit;
	}

	public String getLib() {
		return _lib;
	}

	public void setLib(String lib) {
		_lib = lib;
	}

	public long getPrix() {
		return _prix;
	}

	public void setPrix(long prix) {
		_prix = prix;
	}

	public String getDateMiseVente() {
		return _dateMiseVente;
	}

	public void setDateMiseVente(String dateMiseVente) {
		_dateMiseVente = dateMiseVente;
	}

	private int _idProduit;
	private String _lib;
	private long _prix;
	private String _dateMiseVente;
}