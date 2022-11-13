package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Елизавета")
                .setSurname("Виндзор")
                .setAge(93)
                .setAddress("Лондон")
                .build();

        mom.happyBirthday();
        mom.happyBirthday();
        mom.happyBirthday();

        mom.setAddress("Букингемский дворец");

        Person son = mom.newChildBuilder()
                .setName("Чарльз Филипп Артур Джордж")
                .setAge(73)
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        if (son.hasAddress()) {
            System.out.println(son.getName() + " " + son.getSurname() +
                    " проживает вместе с мамой в " + son.getAddress() + ".");
        }

        try {
            new PersonBuilder().setAge(130).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}