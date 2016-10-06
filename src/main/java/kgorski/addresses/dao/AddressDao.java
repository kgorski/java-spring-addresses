package kgorski.addresses.dao;

import java.util.List;
import kgorski.addresses.model.Address;

/**
 * Address Dao interface.
 * 
 * @author kgorski
 */
public interface AddressDao {
    /**
     * Gets all addresses.
     * 
     * @return List<Address>
     */
    public List<Address> findAll();

    /**
     * Persists address.
     * 
     * @param address the address entity
     * @return Address
     */
    public Address save(Address address);
}
