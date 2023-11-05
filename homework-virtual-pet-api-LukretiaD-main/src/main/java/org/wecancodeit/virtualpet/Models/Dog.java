package org.wecancodeit.virtualpet.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

//dog class extending live pet for cage cleaning
@Entity
public class Dog extends PetLive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean dirtyCage;
    // private int dogPoopCounter;
    // private int poopInCage;

    protected Dog() {

    }

    public Dog(String name, String petDescription, int hunger, int thirst, int waste, int boredom) { //boolean dirtyCage, Shelter shelter
        super(name, petDescription, hunger, thirst, waste, boredom);
        this.dirtyCage = dirtyCage;
        // this.poopInCage = dogPoopCounter++;
        this.shelter = shelter;

    }

    @ManyToOne
    private Shelter shelter;

    @OneToMany(mappedBy = "dog")
    private Collection<Cat> cat;


    public Long getId() {
        return id;
    }

    public Collection<Cat> getCat() {
        return cat;
    }

    public boolean isDirtyCage() {
        return dirtyCage;
    }

    public void setDirtyCage(boolean dirtyCage) {
        this.dirtyCage = dirtyCage;
    }

    // public void useCage() {
    // if (this.waste >= 25) {
    // this.waste = 0;
    // this.poopInCage++;
    // // System.out.println(this.name + " just pooped in their cage.");
    // }
    // }

    // public void cleanCage(boolean feline) {

    // if (this.dirtyCage = true) {
    // this.poopInCage = 0;
    // this.dirtyCage = false;
    // // System.out.println(this.name + "'s cage is now clean!");
    // // } else {
    // // System.out.println(this.name + "'s cage doesn't need to be cleaned right
    // now.");
    // // }
    // }
    // }

    // public void dogTick() {
    // this.waste += 5;
    // useCage();

    // // if (this.dirtyCage = true) {
    // // System.out.println(this.name + " needs their cage cleaned!");
    // // }

    // if (this.poopInCage >= 3) {
    // this.dirtyCage = true;
    // // System.out.println(this.name + " needs their cage cleaned!");
    // }
    // }

    @Override
    public String toString() {

        return "Dog [id=" + id + ", name=" + name + ", description=" + petDescription + ", hunger=" + hunger
                + ", thirst=" + thirst + ", waste=" + waste + ", boredom=" + boredom + "]";

}
}
