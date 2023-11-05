package org.wecancodeit.virtualpet.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PetRobot extends Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int oil;
    private boolean changeOil;
    private boolean changeBattery;
    private int recharge;
    private int repair;
    private int dirty;

    @ManyToOne
    private Cat cat;


    protected PetRobot() {

    }

    public PetRobot(String name, String petDescription, int oil, int recharge,int repair, int dirty){ //, boolean changeOil, boolean changeBattery  
        super(name, petDescription);
        this.oil = oil;
        // this.changeOil = changeOil;
        // this.changeBattery = changeBattery;
        this.recharge = recharge;
        this.repair = repair;
        this.dirty = dirty;
        // this.cat = cat;
    }

    public Long getId() {
        return id;
    }

    public boolean isChangeOil() {
        return changeOil;
    }

    public void setChangeOil(boolean changeOil) {
        this.changeOil = changeOil;
    }

    public boolean isChangeBattery() {
        return changeBattery;
    }

    public void setChangeBattery(boolean changeBattery) {
        this.changeBattery = changeBattery;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getRecharge() {
        return recharge;
    }

    public void setRecharge(int recharge) {
        this.recharge = recharge;
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }

    public int getDirty() {
        return dirty;
    }

    public void setDirty(int dirty) {
        this.dirty = dirty;
    }

    @Override
    public String toString() {
        return "PetRobot [id=" + id + ", name=" + name + ", oil=" + oil + ", recharge=" + recharge + ", repair=" + repair + ", dirty="
                + dirty + "]";
    }

    // // robot pet actions
    // public void oilRobot() {
    //     if (changeOil = true) {
    //         oil = 10;
    //         dirty += 5;
    //         System.out.println("You spilled oil on " + this.name + ".");
    //     }
    // }

    // public void chargeRobot() {
    //     if (changeBattery = true) {
    //         recharge -= 20;
    //         repair -= 4;
    //         oil += 1;
    //         if (recharge < 60) {
    //             System.out.println("Be careful not to overcharge " + this.name + ".");
    //         }
    //     }
    // }

    // public void robotDance() throws Exception {
    //     Thread.sleep(1000);
    //     System.out.println("Robots are syncing up. . .");
    //     Thread.sleep(1000);
    //     recharge += 20;
    //     oil += 25;
    //     repair += 10;
    //     dirty += 5;
    //     System.out.println("Domo Arigato Mister Roboto!");
    // }

    // public void robotLaser() {
    //     recharge += 35;
    //     oil += 15;
    //     repair += 10;
    //     // System.out.println("Pew-Pew, do not aim for the eyes!");
    // }

    // // repair and clean methods
    // public void repairRobot() {
    //     oil = 25;
    //     repair = 25;
    //     System.out.println("Would you like to apply for a warranty?");
    // }

    // public void cleanRobot() {
    //     recharge = 25;
    //     dirty = 25;
    //     System.out.println("It has the new car smell! ");
    // }

    // // robot tick method
    // public void robTick() {
    //     this.recharge += 4;
    //     this.oil += 2;
    //     this.dirty += 7;

    //     if (this.oil >= 85) {
    //         System.out.println(this.name + " System Alert: Low oil Detected!");
    //     }
    //     if (this.recharge >= 85) {
    //         System.out.println(this.name + " System Alert : Low Battery, Please Charge!");
    //     }
    //     if (this.repair >= 85) {
    //         System.out.println(this.name + " System Alert : Malfunction Detected!");
    //     }
    //     if (this.dirty >= 80) {
    //         System.out.println(this.name + " System Alert : Sensor Block Detected!");
    //     }

    // }

    

}