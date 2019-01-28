/*
Создайте класс Wolf:
- напишите в нем поля: пол, кличка, вес, возраст, окрас
- напишите в нем методы: идти, сидеть, бежать, выть, охотиться
 */

public class Wolf {
    String gender;
    String name;
    double weight;
    int age;
    String color;

    void go() {
        System.out.println("go");
    }

    void sit() {
        System.out.println("sit");
    }

    void run() {
        System.out.println("run");
    }

    void howl() {
        System.out.println("howl");
    }

    void hunt() {
        System.out.println("hunt");
    }
}