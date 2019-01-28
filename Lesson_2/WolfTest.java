/*
Создайте класс WolfTest с методом main:
- создайте объект типа Wolf
- присвойте в нем полям экземпляра класса Wolf какие-то значения
- считайте эти значения из полей и отобразите в консоли
- вызовите методы объекта
 */

public class WolfTest {
    public static void main(String[] args) {
        Wolf animal = new Wolf();
        animal.name = "Dogy";
        animal.age = 10;
        animal.weight = 40.3;
        animal.color = "gray";
        animal.gender = "male";

        System.out.println(animal.name);
        System.out.println(animal.age);
        System.out.println(animal.weight);
        System.out.println(animal.color);
        System.out.println(animal.gender);

        animal.go();
        animal.sit();
        animal.run();
        animal.howl();
        animal.hunt();
    }
}