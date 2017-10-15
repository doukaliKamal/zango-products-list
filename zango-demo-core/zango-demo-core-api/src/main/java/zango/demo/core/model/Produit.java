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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Produit service. Represents a row in the &quot;ZANGO_Produit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ProduitModel
 * @see zango.demo.core.model.impl.ProduitImpl
 * @see zango.demo.core.model.impl.ProduitModelImpl
 * @generated
 */
@ImplementationClassName("zango.demo.core.model.impl.ProduitImpl")
@ProviderType
public interface Produit extends ProduitModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link zango.demo.core.model.impl.ProduitImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Produit, Integer> ID_PRODUIT_ACCESSOR = new Accessor<Produit, Integer>() {
			@Override
			public Integer get(Produit produit) {
				return produit.getIdProduit();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Produit> getTypeClass() {
				return Produit.class;
			}
		};
}