/*
Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе, как мы это делали в уроке). Это позволит на его основе создавать любого робота:
- информацию о роботах можно найти здесь
- выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы). Реализуйте это в коде (не усложняйте реализацию. Делайте все максимально просто)
- создайте 2 экземпляра класса Jaeger и поэкспериментируйте с ними (проинициализируйте поля, вызывайте методы, перезаписывайте и выводите значения полей)
- для инициализации полей объектов при их создании используйте в начале сеттеры (покажите решение ментору), а потом перепишите, используя конструктор
 */

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger();
        robot1.setName("Striker Eureka");
        robot1.setLaunched(2019);
        robot1.setOrigin("Australia");
        robot1.setHeight(76.2);
        robot1.setWeight(1.850);
        robot1.setSpeed(10);
        robot1.setStrength(10);
        robot1.setArmor(9);

        System.out.println("Robot№1");
        System.out.println("name: " + robot1.getName());
        System.out.println("launched: " + robot1.getLaunched());
        System.out.println("origin: " + robot1.getOrigin());
        System.out.println("height: " + robot1.getHeight());
        System.out.println("weight: " + robot1.getWeight());
        System.out.println("speed: " + robot1.getSpeed());
        System.out.println("strength: " + robot1.getStrength());
        System.out.println("armor: " + robot1.getArmor());

        System.out.println();

        Jaeger robot2 = new Jaeger();
        robot2.setName("Cherno Alpha");
        robot2.setLaunched(2015);
        robot2.setOrigin("Russia");
        robot2.setHeight(85.34);
        robot2.setWeight(2.412);
        robot2.setSpeed(3);
        robot2.setStrength(10);
        robot2.setArmor(10);

        System.out.println("Robot№2");
        System.out.println("name: " + robot2.getName());
        System.out.println("launched: " + robot2.getLaunched());
        System.out.println("origin: " + robot2.getOrigin());
        System.out.println("height: " + robot2.getHeight());
        System.out.println("weight: " + robot2.getWeight());
        System.out.println("speed: " + robot2.getSpeed());
        System.out.println("strength: " + robot2.getStrength());
        System.out.println("armor: " + robot2.getArmor());
    }
}