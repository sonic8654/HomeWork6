package ru.geekbrain.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal vasya = new Cat(200,2,2);
        vasya.run(1450);
        vasya.swim(1);
        vasya.jump(2);

        System.out.println("Собака: ");
        Animal bobik = new Dog(500,3,2);
        bobik.run(400);
        bobik.swim(2);
        bobik.jump(5);
    }
    //    public static void main(String[] args) {
//        Animal vasya = new Cat("Васька");
//        System.out.println(vasya.getAnimalName());
//        vasya.run(600);
//        vasya.jump(1.5f);
//        vasya.swim(1);
//
//        Animal sharik = new Cat("Шарик");
//        System.out.println(sharik.getAnimalName());
//
//
//        // Создать массив животных и попробовать написать Animal[0] = new Cat
//        Animal[] animals = new Animal[5];
//        animals[0] = new Cat("Елка");
//        animals[1] = new Dog("Муха");
//        ...
//    }
}
