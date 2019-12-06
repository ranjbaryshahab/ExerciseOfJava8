package ir.maktab.java32.projects.exerciseofjava8;

import ir.maktab.java32.projects.exerciseofjava8.model.Address;
import ir.maktab.java32.projects.exerciseofjava8.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExerciseOfJava8Application {
    public static void main(String[] args) {
        Address shahabAddress = new Address("Tehran", 1, "Par", "Pars", "01");
        Person shahab = new Person("Shahab", "Ranjbary", 23, shahabAddress);

        Address aliAddress = new Address("Esfehan", 2, "New", "NewY", "02");
        Person ali = new Person("Ali", "Kheyri", 26, aliAddress);

        Address mohammadAddress = new Address("Tehran", 2, "Mos", "Mosc", "03");
        Person mohammad = new Person("mohammad", "razavi", 24, mohammadAddress);

        Address alirezaAddress = new Address("Tehran", 6, "Lon", "Lond", "04");
        Person alireza = new Person("alireza", "rezvani", 25, alirezaAddress);


        List<Person> personList = new ArrayList<>();
        personList.add(alireza);
        personList.add(shahab);
        personList.add(ali);
        personList.add(mohammad);

        System.out.println("\n*******************************************************************");
        System.out.println("Sorted list by age: ");
        personList.sort(Comparator.comparing(Person::getAge).reversed());
        personList.forEach(System.out::println);

        System.out.println("\n*******************************************************************\n");
        System.out.println("Sorted list by lastName length: ");

        personList.sort(Comparator.comparing(p -> p.getLastName().length()));
        personList.forEach(System.out::println);

        System.out.println("\n*******************************************************************\n");
        System.out.println("Filtered by city equal Tehran and zone little than 5");
        personList.stream().filter(
                p -> p.getAddress().getCity().equals("Tehran") && p.getAddress().getZone() < 5)
                .forEach(System.out::println);

        System.out.println("\n*******************************************************************\n");


    }

}
