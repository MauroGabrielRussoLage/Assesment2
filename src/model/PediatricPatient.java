package model;

import model.interfaces.Patient;

public class PediatricPatient extends Patient {

    private int gestionalAge;
    private double birthWeight;
    private boolean immunization;

    public PediatricPatient(String name, int age, long ID) {
        setName(name);
        setID(ID);
        setAge(age);
    }

    public int getGestionalAge() {
        return gestionalAge;
    }

    public void setGestionalAge(int gestionalAge) {
        this.gestionalAge = gestionalAge;
    }

    public double getBirthWeight() {
        return birthWeight;
    }

    public void setBirthWeight(double birthWeight) {
        this.birthWeight = birthWeight;
    }

    public boolean isImmunization() {
        return immunization;
    }

    public void setImmunization(boolean immunization) {
        this.immunization = immunization;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + getName() + "\n");
        sb.append("Age: " + getAge() + "\n");
        sb.append("ID: " + getID() + "\n");
        return sb.toString();
    }
}
