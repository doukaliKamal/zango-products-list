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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import zango.demo.core.model.Produit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Produit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Produit
 * @generated
 */
@ProviderType
public class ProduitCacheModel implements CacheModel<Produit>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProduitCacheModel)) {
			return false;
		}

		ProduitCacheModel produitCacheModel = (ProduitCacheModel)obj;

		if (idProduit == produitCacheModel.idProduit) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idProduit);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idProduit=");
		sb.append(idProduit);
		sb.append(", lib=");
		sb.append(lib);
		sb.append(", prix=");
		sb.append(prix);
		sb.append(", dateMiseVente=");
		sb.append(dateMiseVente);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Produit toEntityModel() {
		ProduitImpl produitImpl = new ProduitImpl();

		produitImpl.setIdProduit(idProduit);

		if (lib == null) {
			produitImpl.setLib(StringPool.BLANK);
		}
		else {
			produitImpl.setLib(lib);
		}

		produitImpl.setPrix(prix);

		if (dateMiseVente == null) {
			produitImpl.setDateMiseVente(StringPool.BLANK);
		}
		else {
			produitImpl.setDateMiseVente(dateMiseVente);
		}

		produitImpl.resetOriginalValues();

		return produitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idProduit = objectInput.readInt();
		lib = objectInput.readUTF();

		prix = objectInput.readLong();
		dateMiseVente = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(idProduit);

		if (lib == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lib);
		}

		objectOutput.writeLong(prix);

		if (dateMiseVente == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dateMiseVente);
		}
	}

	public int idProduit;
	public String lib;
	public long prix;
	public String dateMiseVente;
}