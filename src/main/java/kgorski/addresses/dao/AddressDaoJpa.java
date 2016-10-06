package kgorski.addresses.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import kgorski.addresses.model.Address;

/**
 * Address Dao JPA implementation.
 * 
 * @author kgorski
 */
@Repository
@Transactional
public class AddressDaoJpa implements AddressDao {
    /** Entity manager */
    @PersistenceContext
    private EntityManager entityManager;
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<Address> findAll() {
        return entityManager.createQuery("SELECT a FROM Address a").getResultList(); 
    }

    /**
     * {@inheritDoc}
     */
    public Address save(Address address) {
        entityManager.persist(address);

        return address;
    }
}
