package org.wecancodeit.virtualpet.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String location;
    private long phoneNumber;
    private String contactPerson;

    protected Shelter() {
    }

    public Shelter(String name, String location, long phoneNumber, String contactPerson) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
    }


    @OneToMany(mappedBy = "shelter")
    private Collection<Dog> dog;


        @ManyToMany(mappedBy = "shelter")
    private Collection<Volunteer> Volunteer;


    public Collection<Volunteer> getVolunteer() {
        return Volunteer;
    }


    public Collection<Dog> getDog() {
        return dog;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getId() {
        return id;
    }




    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = prime * result + ((contactPerson == null) ? 0 : contactPerson.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Shelter other = (Shelter) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (phoneNumber != other.phoneNumber)
            return false;
        if (contactPerson == null) {
            if (other.contactPerson != null)
                return false;
        } else if (!contactPerson.equals(other.contactPerson))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Shelter [name=" + name + ", location=" + location + ", phoneNumber=" + phoneNumber + ", contactPerson="
                + contactPerson + "]";
    }

}
