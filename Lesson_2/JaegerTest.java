/*
Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе, как мы это делали в уроке). Это позволит на его основе создавать любого робота:
- информацию о роботах можно найти здесь
- выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы). Реализуйте это в коде (не усложняйте реализацию. Делайте все максимально просто)
- создайте 2 экземпляра класса Jaeger и поэкспериментируйте с ними (проинициализируйте поля, вызывайте методы, перезаписывайте и выводите значения полей)
- для инициализации полей объектов при их создании используйте в начале сеттеры (покажите решение ментору), а потом перепишите, используя конструктор
 */

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.name = "Striker Eureka";
        strikerEureka.launched = 2019;
        strikerEureka.origin = "Australia";
        strikerEureka.height = 76.2;
        strikerEureka.weight = 1.850;
        strikerEureka.speed = 10;
        strikerEureka.strength = 10;
        strikerEureka.armor = 9;

        System.out.println("name: " + strikerEureka.name);
        System.out.println("launched: " + strikerEureka.launched);
        System.out.println("origin: " + strikerEureka.origin);
        System.out.println("height: " + strikerEureka.height);
        System.out.println("weight: " + strikerEureka.weight);
        System.out.println("speed: " + strikerEureka.speed);
        System.out.println("strength: " + strikerEureka.strength);
        System.out.println("armor: " + strikerEureka.armor);

        System.out.println();

        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.name = "Cherno Alpha";
        chernoAlpha.launched = 2015;
        chernoAlpha.origin = "Russia";
        chernoAlpha.height = 85.34;
        chernoAlpha.weight = 2.412;
        chernoAlpha.speed = 3;
        chernoAlpha.strength = 10;
        chernoAlpha.armor = 10;

        System.out.println("name: " + chernoAlpha.name);
        System.out.println("launched: " + chernoAlpha.launched);
        System.out.println("origin: " + chernoAlpha.origin);
        System.out.println("height: " + chernoAlpha.height);
        System.out.println("weight: " + chernoAlpha.weight);
        System.out.println("speed: " + chernoAlpha.speed);
        System.out.println("strength: " + chernoAlpha.strength);
        System.out.println("armor: " + chernoAlpha.armor);
    }
}