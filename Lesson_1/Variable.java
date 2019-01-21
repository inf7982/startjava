/*
Создайте класс Variable с методом main
Объявите в методе переменные всех существующих в Java примитивных типов данных. Каждой переменной присвойте значение
В качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора и тд.
Выведите все значения переменных на консоль
*/
public class Variable {	
    public static void main(String[] args) {
        byte motherBoard = 1;
        short processorsCores = 8;
        int memoryRAM = 4;
        long memoryGPU = 8;
        float frequencyCPU = 3.4f;
        double capacitySSD = 256.0d;
        char driveLetter = 'C';
        boolean workStatus = true;
        System.out.println("motherboard: " + motherBoard);
        System.out.println("processor's cores: " + processorsCores);
        System.out.println("RAM memory: " + memoryRAM);
        System.out.println("GPU memory: " + memoryGPU);
        System.out.println("CPU frequency: " + frequencyCPU);
        System.out.println("SSD capacity: " + capacitySSD);
        System.out.println("Drive letter: " + driveLetter);
        System.out.println("Work status: " + workStatus);
    }
}