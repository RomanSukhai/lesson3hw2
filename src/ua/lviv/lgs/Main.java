package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {

        Animal a =new Animal("Vasul",40.6,12);

        System.out.println("Ім'я тваринки: "+a.getNameAnimal()+";"+" Швидкість тваринки: "+a.getSpeedAnimal()+"км/год"+"; "+" Вік тваринки: "+a.getAgeAnimal()+";");


        a.setNameAnimal("Roman");
        a.setSpeedAnimal(200.7);
        a.setAgeAnimal(20);

        System.out.println(" ");
        System.out.println("Ім'я тваринки: "+a.getNameAnimal()+";"+" Швидкість тваринки: "+a.getSpeedAnimal()+"км/год"+"; "+" Вік тваринки: "+a.getAgeAnimal()+";");

    }
}
