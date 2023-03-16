package HW4;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        //исходные массивы
        var data = new String[] { "Hello", "Bay" , "Extra", "Array"};
        var data2 = new Integer[] { 1, 2, 3, -5 , -2, 0};
        var data3 = new Double[] { 7.5, 2.3, 4.8, 3.14, -0.05 };

        //создание объекта DynamicArray
        DynamicArray<String> a = new DynamicArray<String>(data);
        DynamicArray<Integer> b = new DynamicArray<>(data2);
        DynamicArray<Double> c = new DynamicArray<>(data3);

        //Печать
        System.out.println("Созданные объекты");
        dataView(a, b, c);
        
        //Добавление элементов
        System.out.println("После добавления элементов");
        a.add("Hope");
        b.add(5);
        c.add(0.85);
        dataView(a, b, c);
        
        //удаление по индексу
        System.out.println("Удаление индекса 1");
        a.delete(1);
        b.delete(1);
        c.delete(1);
        dataView(a, b, c);
        
        //удаление по значению         
        System.out.println("Удаление по значению");
        a.deleteVaues("Bay");
        b.deleteVaues(3);
        c.deleteVaues(4.8);
        dataView(a, b, c);
        
        //Минималные значения
        System.out.println("Минимальные значения объектов");        
        System.out.println(a.min());
        System.out.println(b.min());
        System.out.println(c.min());
        
        //Максимальные значения объектов
        System.out.println("Максимальные значения объектов");        
        System.out.println(a.max());
        System.out.println(b.max());
        System.out.println(c.max());
        
        //Сортировка объектов
        System.out.println("После сортировки");        
        System.out.println(a.bubleSort());
        System.out.println(b.insertionSort());
        System.out.println(c.selectionSort());
        
        //Сумма и умножение всех элементов объекта
        System.out.println("Сумма и произведение");        
        System.out.println(b.sum());
        System.out.println(a.sum());
        System.out.println(c.mult());
        
        //Установка нового значения в индекс 1
        System.out.println("Новое значение в индексе 1");        
        a.setValue("Peace", 1);
        b.setValue(8, 1);
        c.setValue(8.3, 1);
        dataView(a, b, c);
        
        //Длина массива
        System.out.println("Длина массива");        
        System.out.println(a.size());
        System.out.println(b.size());
        System.out.println(c.size());

    }
    
    public static void dataView(DynamicArray<String> a, DynamicArray<Integer> b, DynamicArray<Double> c) {
        System.out.printf("Строки:\n %s\n",a);
        System.out.printf("Целые числа:\n %s\n",b);
        System.out.printf("Нецелые числа:\n %s\n\n", c);
        
    }
}
