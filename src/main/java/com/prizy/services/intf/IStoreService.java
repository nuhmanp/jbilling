package com.prizy.services.intf;

import java.util.List;

import com.prizy.entities.Store;

/**
 * @author Shailendra
 *
 */
public interface IStoreService {

	public List<Store> getAllStores();

	public void create(Store store);

	public Store getStore(long id);

}
