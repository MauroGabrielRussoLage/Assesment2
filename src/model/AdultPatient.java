package model;

import model.interfaces.Patient;

public class AdultPatient extends Patient {

    private boolean working;
    private boolean smoker;
    private boolean alcoholism;

    public AdultPatient(String name, int age, long ID) {
        setName(name);
        setID(ID);
        setAge(age);
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean hasAlcoholism() {
        return alcoholism;
    }

    public void setAlcoholism(boolean alcoholism) {
        this.alcoholism = alcoholism;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + getName() + "\n");
        sb.append("Age: " + getAge() + "\n");
        sb.append("ID: " + getID() + "\n");
        sb.append("Works: " + (isWorking() ? "Yes" : "No") + "\n");
        sb.append("Smoker: " + (isSmoker() ? "Yes" : "No") + "\n");
        sb.append("Alcoholism: " + (hasAlcoholism() ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}
