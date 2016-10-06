package kgorski.addresses.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kgorski.addresses.dao.AddressDaoJpa;
import kgorski.addresses.model.Address;

/**
 * Address service implementation.
 * 
 * @author kgorski
 */
@Service
public class AddressServiceImpl implements AddressService {
    /** Address Dao JPA */
    @Autowired
    private AddressDaoJpa addressDaoJpa;

    /**
     * {@inheritDoc}
     */
    public List<Address> findAll() {
        return addressDaoJpa.findAll();
    }
    
    /**
     * {@inheritDoc}
     */
    public Address save(Address address) {
        return addressDaoJpa.save(address);
    }
}
