package lms_task2;

import java.util.Arrays;

public class Farm {
    String address;
    Animal[] cows;
    Animal[] sheep;
    Animal[] horses;
    String ownerName;

    public Farm(String address, Animal[] cows, Animal[] sheep, Animal[] horses, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Animal[] getCows() {
        return cows;
    }

    public void setCows(Animal[] cows) {
        this.cows = cows;
    }

    public Animal[] getSheep() {
        return sheep;
    }

    public void setSheep(Animal[] sheep) {
        this.sheep = sheep;
    }

    public Animal[] getHorses() {
        return horses;
    }

    public void setHorses(Animal[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return " " +
                "address='" + address + "\n" +
                " cows=" + Arrays.toString(cows)+"\n" +
                " sheep=" + Arrays.toString(sheep) +"\n"+
                " horses=" + Arrays.toString(horses) +"\n"+
                " ownerName='" + ownerName + "\n" ;
    }
}
