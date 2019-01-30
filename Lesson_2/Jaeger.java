/*
Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе, как мы это делали в уроке). Это позволит на его основе создавать любого робота:
- информацию о роботах можно найти здесь
- выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы). Реализуйте это в коде (не усложняйте реализацию. Делайте все максимально просто)
- создайте 2 экземпляра класса Jaeger и поэкспериментируйте с ними (проинициализируйте поля, вызывайте методы, перезаписывайте и выводите значения полей)
- для инициализации полей объектов при их создании используйте в начале сеттеры (покажите решение ментору), а потом перепишите, используя конструктор
 */

public class Jaeger {
    private String name;
    private int launched;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunched() {
        return launched;
    }

    public void setLaunched(int launched) {
        this.launched = launched;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}