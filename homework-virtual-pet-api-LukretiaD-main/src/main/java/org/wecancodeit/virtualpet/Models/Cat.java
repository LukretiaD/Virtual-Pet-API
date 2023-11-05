package org.wecancodeit.virtualpet.Models;

import java.util.Collection;

// import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

//cat class extending live pet for liter box
@Entity
public class Cat extends PetLive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Boolean litterBox;
    // private int poopCounter;
    // private int poopInBox;

    @ManyToOne
    private Dog dog;

    protected Cat() {

    }

    public Cat(String name, String petDescription, int hunger, int thirst, int waste, int boredom) {
        super(name, petDescription, hunger, thirst, waste, boredom); // true
        // this.litterBox = litterBox;
        // this.poopInBox = poopCounter++;

    }

    @OneToMany(mappedBy = "cat")
    private Collection<PetRobot> robot;

    public Collection<PetRobot> getRobot() {
        return robot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // public Boolean getLitterBox() {
    // return litterBox;
    // }

    // public void setLitterBox(Boolean litterBox) {
    // this.litterBox = litterBox;
    // }

    // public void useLitterBox() {
    // if (this.waste >= 25) {
    // this.waste = 0;
    // this.poopInBox++;
    // // System.out.println(this.name + " just used the litter box.");
    // }
    // }

    // public void cleanLitter(boolean feline) {
    // if (feline) {
    // if (this.litterBox = true) {
    // this.poopInBox = 0;
    // this.litterBox = false;
    // // System.out.println(this.name + "'s litter box is now clean.");
    // // } else {
    // // System.out.println(this.name + "'s litter box doesn't need to be cleaned
    // right now.");
    // }
    // }
    // }

    // public void catTick() {
    // this.waste += 5;
    // useLitterBox();

    // if (this.poopInBox >= 3) {
    // this.litterBox = true;
    // // System.out.println(this.name + " needs their litter box changed!");
    // }
    // }

    @Override
    public String toString() {

        return "Cat [id=" + id + ", name=" + name + ", description=" + petDescription + ", hunger=" + hunger
                + ", thirst=" + thirst + ", waste=" + waste + ", boredom=" + boredom + "]";

    }

}
