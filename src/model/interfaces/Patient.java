package model.interfaces;

public abstract class Patient {
    private String name;
    private int age;
    private long ID;

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected long getID() {
        return ID;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setID(long id) {
        this.ID = id;
    }

    public String toString() {
        return null;
    };
}
