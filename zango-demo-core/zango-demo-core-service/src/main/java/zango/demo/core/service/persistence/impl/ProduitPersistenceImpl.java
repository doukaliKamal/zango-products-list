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

package zango.demo.core.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import zango.demo.core.exception.NoSuchProduitException;
import zango.demo.core.model.Produit;
import zango.demo.core.model.impl.ProduitImpl;
import zango.demo.core.model.impl.ProduitModelImpl;
import zango.demo.core.service.persistence.ProduitPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the produit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProduitPersistence
 * @see zango.demo.core.service.persistence.ProduitUtil
 * @generated
 */
@ProviderType
public class ProduitPersistenceImpl extends BasePersistenceImpl<Produit>
	implements ProduitPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProduitUtil} to access the produit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProduitImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProduitModelImpl.ENTITY_CACHE_ENABLED,
			ProduitModelImpl.FINDER_CACHE_ENABLED, ProduitImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProduitModelImpl.ENTITY_CACHE_ENABLED,
			ProduitModelImpl.FINDER_CACHE_ENABLED, ProduitImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProduitModelImpl.ENTITY_CACHE_ENABLED,
			ProduitModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ProduitPersistenceImpl() {
		setModelClass(Produit.class);
	}

	/**
	 * Caches the produit in the entity cache if it is enabled.
	 *
	 * @param produit the produit
	 */
	@Override
	public void cacheResult(Produit produit) {
		entityCache.putResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
			ProduitImpl.class, produit.getPrimaryKey(), produit);

		produit.resetOriginalValues();
	}

	/**
	 * Caches the produits in the entity cache if it is enabled.
	 *
	 * @param produits the produits
	 */
	@Override
	public void cacheResult(List<Produit> produits) {
		for (Produit produit : produits) {
			if (entityCache.getResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
						ProduitImpl.class, produit.getPrimaryKey()) == null) {
				cacheResult(produit);
			}
			else {
				produit.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all produits.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProduitImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the produit.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Produit produit) {
		entityCache.removeResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
			ProduitImpl.class, produit.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Produit> produits) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Produit produit : produits) {
			entityCache.removeResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
				ProduitImpl.class, produit.getPrimaryKey());
		}
	}

	/**
	 * Creates a new produit with the primary key. Does not add the produit to the database.
	 *
	 * @param idProduit the primary key for the new produit
	 * @return the new produit
	 */
	@Override
	public Produit create(int idProduit) {
		Produit produit = new ProduitImpl();

		produit.setNew(true);
		produit.setPrimaryKey(idProduit);

		return produit;
	}

	/**
	 * Removes the produit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idProduit the primary key of the produit
	 * @return the produit that was removed
	 * @throws NoSuchProduitException if a produit with the primary key could not be found
	 */
	@Override
	public Produit remove(int idProduit) throws NoSuchProduitException {
		return remove((Serializable)idProduit);
	}

	/**
	 * Removes the produit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the produit
	 * @return the produit that was removed
	 * @throws NoSuchProduitException if a produit with the primary key could not be found
	 */
	@Override
	public Produit remove(Serializable primaryKey)
		throws NoSuchProduitException {
		Session session = null;

		try {
			session = openSession();

			Produit produit = (Produit)session.get(ProduitImpl.class, primaryKey);

			if (produit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProduitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(produit);
		}
		catch (NoSuchProduitException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Produit removeImpl(Produit produit) {
		produit = toUnwrappedModel(produit);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(produit)) {
				produit = (Produit)session.get(ProduitImpl.class,
						produit.getPrimaryKeyObj());
			}

			if (produit != null) {
				session.delete(produit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (produit != null) {
			clearCache(produit);
		}

		return produit;
	}

	@Override
	public Produit updateImpl(Produit produit) {
		produit = toUnwrappedModel(produit);

		boolean isNew = produit.isNew();

		Session session = null;

		try {
			session = openSession();

			if (produit.isNew()) {
				session.save(produit);

				produit.setNew(false);
			}
			else {
				produit = (Produit)session.merge(produit);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
			ProduitImpl.class, produit.getPrimaryKey(), produit, false);

		produit.resetOriginalValues();

		return produit;
	}

	protected Produit toUnwrappedModel(Produit produit) {
		if (produit instanceof ProduitImpl) {
			return produit;
		}

		ProduitImpl produitImpl = new ProduitImpl();

		produitImpl.setNew(produit.isNew());
		produitImpl.setPrimaryKey(produit.getPrimaryKey());

		produitImpl.setIdProduit(produit.getIdProduit());
		produitImpl.setLib(produit.getLib());
		produitImpl.setPrix(produit.getPrix());
		produitImpl.setDateMiseVente(produit.getDateMiseVente());

		return produitImpl;
	}

	/**
	 * Returns the produit with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the produit
	 * @return the produit
	 * @throws NoSuchProduitException if a produit with the primary key could not be found
	 */
	@Override
	public Produit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProduitException {
		Produit produit = fetchByPrimaryKey(primaryKey);

		if (produit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProduitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return produit;
	}

	/**
	 * Returns the produit with the primary key or throws a {@link NoSuchProduitException} if it could not be found.
	 *
	 * @param idProduit the primary key of the produit
	 * @return the produit
	 * @throws NoSuchProduitException if a produit with the primary key could not be found
	 */
	@Override
	public Produit findByPrimaryKey(int idProduit)
		throws NoSuchProduitException {
		return findByPrimaryKey((Serializable)idProduit);
	}

	/**
	 * Returns the produit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the produit
	 * @return the produit, or <code>null</code> if a produit with the primary key could not be found
	 */
	@Override
	public Produit fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
				ProduitImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Produit produit = (Produit)serializable;

		if (produit == null) {
			Session session = null;

			try {
				session = openSession();

				produit = (Produit)session.get(ProduitImpl.class, primaryKey);

				if (produit != null) {
					cacheResult(produit);
				}
				else {
					entityCache.putResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
						ProduitImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
					ProduitImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return produit;
	}

	/**
	 * Returns the produit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idProduit the primary key of the produit
	 * @return the produit, or <code>null</code> if a produit with the primary key could not be found
	 */
	@Override
	public Produit fetchByPrimaryKey(int idProduit) {
		return fetchByPrimaryKey((Serializable)idProduit);
	}

	@Override
	public Map<Serializable, Produit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Produit> map = new HashMap<Serializable, Produit>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Produit produit = fetchByPrimaryKey(primaryKey);

			if (produit != null) {
				map.put(primaryKey, produit);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
					ProduitImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Produit)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRODUIT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Produit produit : (List<Produit>)q.list()) {
				map.put(produit.getPrimaryKeyObj(), produit);

				cacheResult(produit);

				uncachedPrimaryKeys.remove(produit.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ProduitModelImpl.ENTITY_CACHE_ENABLED,
					ProduitImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the produits.
	 *
	 * @return the produits
	 */
	@Override
	public List<Produit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the produits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProduitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of produits
	 * @param end the upper bound of the range of produits (not inclusive)
	 * @return the range of produits
	 */
	@Override
	public List<Produit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the produits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProduitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of produits
	 * @param end the upper bound of the range of produits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of produits
	 */
	@Override
	public List<Produit> findAll(int start, int end,
		OrderByComparator<Produit> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the produits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProduitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of produits
	 * @param end the upper bound of the range of produits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of produits
	 */
	@Override
	public List<Produit> findAll(int start, int end,
		OrderByComparator<Produit> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Produit> list = null;

		if (retrieveFromCache) {
			list = (List<Produit>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRODUIT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUIT;

				if (pagination) {
					sql = sql.concat(ProduitModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Produit>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Produit>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the produits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Produit produit : findAll()) {
			remove(produit);
		}
	}

	/**
	 * Returns the number of produits.
	 *
	 * @return the number of produits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRODUIT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProduitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the produit persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ProduitImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRODUIT = "SELECT produit FROM Produit produit";
	private static final String _SQL_SELECT_PRODUIT_WHERE_PKS_IN = "SELECT produit FROM Produit produit WHERE idProduit IN (";
	private static final String _SQL_COUNT_PRODUIT = "SELECT COUNT(produit) FROM Produit produit";
	private static final String _ORDER_BY_ENTITY_ALIAS = "produit.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Produit exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ProduitPersistenceImpl.class);
}