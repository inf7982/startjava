package com.startjava.lesson_2_3.jaeger;

/*
Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе, как мы это делали в уроке). Это позволит на его основе создавать любого робота:
- информацию о роботах можно найти здесь
- выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы). Реализуйте это в коде (не усложняйте реализацию. Делайте все максимально просто)
- создайте 2 экземпляра класса Jaeger и поэкспериментируйте с ними (проинициализируйте поля, вызывайте методы, перезаписывайте и выводите значения полей)
- для инициализации полей объектов при их создании используйте в начале сеттеры (покажите решение ментору), а потом перепишите, используя конструктор
 */

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger("Striker Eureka", 2019, "Australia", 76.2, 1.850, 10, 10, 9);
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", 2015, "Russia", 85.34, 2.412, 3, 10, 10);

        System.out.println("strikerEureka");
        System.out.println("name: " + strikerEureka.getName());
        System.out.println("launched: " + strikerEureka.getLaunched());
        System.out.println("origin: " + strikerEureka.getOrigin());
        System.out.println("height: " + strikerEureka.getHeight());
        System.out.println("weight: " + strikerEureka.getWeight());
        System.out.println("speed: " + strikerEureka.getSpeed());
        System.out.println("strength: " + strikerEureka.getStrength());
        System.out.println("armor: " + strikerEureka.getArmor());

        System.out.println();

        System.out.println("chernoAlpha");
        System.out.println("name: " + chernoAlpha.getName());
        System.out.println("launched: " + chernoAlpha.getLaunched());
        System.out.println("origin: " + chernoAlpha.getOrigin());
        System.out.println("height: " + chernoAlpha.getHeight());
        System.out.println("weight: " + chernoAlpha.getWeight());
        System.out.println("speed: " + chernoAlpha.getSpeed());
        System.out.println("strength: " + chernoAlpha.getStrength());
        System.out.println("armor: " + chernoAlpha.getArmor());
    }
}