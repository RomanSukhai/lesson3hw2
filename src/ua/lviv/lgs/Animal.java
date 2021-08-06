package ua.lviv.lgs;

public class Animal {

    private String NameAnimal;
    private double speedAnimal;
    private int ageAnimal;

    public Animal(String nameAnimal, double speedAnimal, int ageAnimal) {
        NameAnimal = nameAnimal;
        this.speedAnimal = speedAnimal;
        this.ageAnimal = ageAnimal;
    }

    public String getNameAnimal() {
        return NameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        NameAnimal = nameAnimal;
    }

    public double getSpeedAnimal() {
        return speedAnimal;
    }

    public void setSpeedAnimal(double speedAnimal) {
        this.speedAnimal = speedAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }
}
