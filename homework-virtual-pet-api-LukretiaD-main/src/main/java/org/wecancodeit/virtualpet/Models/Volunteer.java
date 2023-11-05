package org.wecancodeit.virtualpet.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String allShelters;

    @ManyToMany
    private Collection<Shelter> shelter;

    protected Volunteer() {
    }

    public Volunteer(String name, String allShelters, Shelter... shelter) {
        this.name = name;
        this.allShelters = allShelters;
        this.shelter = new ArrayList<>(Arrays.asList(shelter));

    }

    public Collection<Shelter> getShelter() {
        return shelter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }


    public String getAllShelters() {
        return allShelters;
    }

    public void setAllShelters(String allShelters) {
        this.allShelters = allShelters;
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((allShelters == null) ? 0 : allShelters.hashCode());
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
        Volunteer other = (Volunteer) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (allShelters == null) {
            if (other.allShelters != null)
                return false;
        } else if (!allShelters.equals(other.allShelters))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Volunteer [id=" + id + ", name=" + name + ", allShelters=" + allShelters + "]";
    }


    

}
