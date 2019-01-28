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
        animal.setName("Dogy");
        animal.setAge(10);
        animal.setWeight(40.3);
        animal.setColor("gray");
        animal.setGender("male");

        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getWeight());
        System.out.println(animal.getColor());
        System.out.println(animal.getGender());

        animal.go();
        animal.sit();
        animal.run();
        animal.howl();
        animal.hunt();
    }
}