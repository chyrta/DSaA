package com.chyrta.Persons;

public class ClassDataApp {

    public static void main(String[] args) {

        int maxSize = 100;
        ClassDataArray array;
        array = new ClassDataArray(maxSize);

        array.insert("Evans", "Patty", 24);
        array.insert("Smith", "Lorraine", 37);
        array.insert("Yee", "Tom", 43);
        array.insert("Pitt", "Brad", 40);
        array.insert("Jolie", "Angelina", 94);
        array.insert("Prosmitsky", "Michael", 40);

        array.displayA();

        String searchKey = "Smith";
        Person found;
        found = array.find(searchKey);
        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Smith, Pitt and Prosmitsky");
        array.delete("Smith");
        array.delete("Pitt");
        array.delete("Prosmitsky");

        array.displayA();

    }
}
