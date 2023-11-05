package org.wecancodeit.virtualpet.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int petID;
    // private static int petCounter = 1;
    public String name;
    public String petDescription;
    // private boolean organic;
    // private boolean feline;

    protected Pet() {

    }

    public Pet(String name, String petDescription) {// , boolean organic, boolean feline in the ()
        this.name = name;
        this.petDescription = petDescription;
        // this.petID = petCounter++;
        // this.organic = organic;
        // this.feline = feline;
    }

    // public boolean isFeline() {
    // return feline;
    // }

    // public void setFeline(boolean feline) {
    // this.feline = feline;

    // }

    // public boolean isOrganic() {
    // return organic;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetID() {
        return petID;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((petDescription == null) ? 0 : petDescription.hashCode());
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
        Pet other = (Pet) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (petDescription == null) {
            if (other.petDescription != null)
                return false;
        } else if (!petDescription.equals(other.petDescription))
            return false;
        return true;
    }

    // @Override
    // public String toString() {
    // return "Pet [petID=" + petID + ", name=" + name + ", petDescription=" +
    // petDescription + "]";
    // }

    // public void petDescription() {
    // System.out.println("Name= " + name + ", Description: " + this.petDescription
    // + " ID: " + this.petID);
    // }

}
