package model;

import model.interfaces.Patient;

public class PediatricPatient extends Patient {

    private int gestationalAge;
    private double birthWeight;
    private boolean immunization;

    public PediatricPatient(String name, int age, long ID) {
        setName(name);
        setID(ID);
        setAge(age);
    }

    public int getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(int gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public double getBirthWeight() {
        return birthWeight;
    }

    public void setBirthWeight(double birthWeight) {
        this.birthWeight = birthWeight;
    }

    public boolean hasImmunization() {
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
        sb.append("Gestational Age: " + gestationalAge + "\n");
        sb.append("Birth Weight: " + birthWeight + "\n");
        sb.append("Immunization: " + (hasImmunization() ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}
