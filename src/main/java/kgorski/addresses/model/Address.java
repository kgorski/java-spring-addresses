package kgorski.addresses.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Address model.
 * 
 * @author kgorski
 */
@Entity
@Table(name = "address")
public class Address {
    /** Address id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /** Street */
    private String street;

    /** Zip */
    private String zip;

    /** City */
    private String city;

    /** Country */
    private String country;

    /** Creation date */
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;

    /** Update date */
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updatedAt;

    /**
     * @return long
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the address id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return String
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    /**
     * @return String
     */
    public String toString() {
        return String.format("%s %s\n%s, %s", street, zip, city, country);
    }
}
