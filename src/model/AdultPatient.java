package model;

import model.interfaces.Patient;

import java.io.Serializable;

public class AdultPatient extends Patient {

    private boolean isWorking;
    private boolean smoked;
    private boolean drinked;

    public AdultPatient(String name, int age, long ID) {
        setName(name);
        setID(ID);
        setAge(age);
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isSmoked() {
        return smoked;
    }

    public void setSmoked(boolean smoked) {
        this.smoked = smoked;
    }

    public boolean isDrinked() {
        return drinked;
    }

    public void setDrinked(boolean drinked) {
        this.drinked = drinked;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + getName() + "\n");
        sb.append("Age: " + getAge() + "\n");
        sb.append("ID: " + getID() + "\n");
        return sb.toString();
    }
}
