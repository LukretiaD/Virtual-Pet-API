package org.wecancodeit.virtualpet.Models;

// import java.util.Scanner;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

// import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

// @Entity
@MappedSuperclass
public class PetLive extends Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Scanner input = new Scanner(System.in);

    public int hunger;
    public int thirst;
    public int waste;
    public int boredom;

    protected PetLive() {

    }

    public PetLive(String name, String petDescription, int hunger, int thirst, int waste, int boredom) { // boolean
                                                                                                         // feline
        super(name, petDescription);

        this.hunger = hunger;
        this.waste = waste;
        this.boredom = boredom;
        this.thirst = thirst;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + hunger;
        result = prime * result + thirst;
        result = prime * result + waste;
        result = prime * result + boredom;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PetLive other = (PetLive) obj;
        if (hunger != other.hunger)
            return false;
        if (thirst != other.thirst)
            return false;
        if (waste != other.waste)
            return false;
        if (boredom != other.boredom)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PetLive [hunger=" + hunger + ", thirst=" + thirst + ", waste=" + waste + ", boredom=" + boredom + "]";
    }

    // public void feedPet() {
    // hunger -= 5;
    // thirst += 2;
    // boredom += 2;
    // waste += 5;

    // }

    // public void hydratePet() {
    // thirst -= 5;
    // hunger += 2;
    // boredom += 2;
    // waste += 2;

    // }

    // public void playPet() {
    // thirst += 5;
    // hunger += 5;
    // boredom -= 10;
    // waste -= 3;

    // }

    // public void tick() {
    // if (this.hunger >= 100) {
    // this.hunger = 100;
    // System.out.println(this.name + " is starving!");
    // } else {
    // this.hunger += 2;
    // }
    // if (this.thirst >= 100) {
    // this.thirst = 100;
    // System.out.println(this.name + " is parched!");
    // input.nextLine();
    // } else {
    // this.thirst += 2;
    // }
    // if (this.boredom >= 100) {
    // this.boredom = 100;
    // System.out.println(this.name + " is dying of boredom!");
    // input.nextLine();
    // } else {
    // this.boredom += 2;
    // }
    // }

    // public void deathTick() {
    // if (this.hunger >= 100) {
    // System.out.println(this.name + " has died from starvation...");
    // System.out.println("Press enter to continue");
    // input.nextLine();
    // this.name = "DEAD";
    // } else if (this.thirst >= 100) {
    // System.out.println(this.name + " has died from dehydration...");
    // System.out.println("Press enter to continue");
    // input.nextLine();
    // this.name = "DEAD";
    // } else if (this.boredom >= 100) {
    // System.out.println(this.name + " has died from dehydration...");
    // System.out.println("Press enter to continue");
    // input.nextLine();
    // this.name = "DEAD";

    // }

    // }
}