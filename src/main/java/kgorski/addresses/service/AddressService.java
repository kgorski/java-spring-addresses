package kgorski.addresses.service;

import java.util.List;
import kgorski.addresses.model.Address;

/**
 * Address service interface.
 * 
 * @author kgorski
 */
public interface AddressService {
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
