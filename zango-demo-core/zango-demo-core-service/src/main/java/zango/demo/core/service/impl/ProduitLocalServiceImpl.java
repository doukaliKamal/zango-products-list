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

package zango.demo.core.service.impl;

import java.sql.Date;

import zango.demo.core.model.Produit;
import zango.demo.core.model.impl.ProduitImpl;
import zango.demo.core.service.base.ProduitLocalServiceBaseImpl;

/**
 * The implementation of the produit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link zango.demo.core.service.ProduitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProduitLocalServiceBaseImpl
 * @see zango.demo.core.service.ProduitLocalServiceUtil
 */
public class ProduitLocalServiceImpl extends ProduitLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link zango.demo.core.service.ProduitLocalServiceUtil} to access the produit local service.
	 * 
	 * 
	 */
	public void saveProduct(String lib,long prix,Date dateMiseVente){
		 
		  
		  Produit produit = new ProduitImpl();
		  produit.setIdProduit((int)counterLocalService.increment());
		  produit.setLib(lib);
		  produit.setPrix(prix);
		  produit.setDateMiseVente(dateMiseVente);
		  updateProduit(produit); 
		  	  

		 }
	
}