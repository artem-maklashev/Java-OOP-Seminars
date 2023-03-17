package HW4;

import java.util.Arrays;

public class DynamicArray<T extends Comparable<T>> implements Numbers {
    private T[] array;
    private int length;   

    public T getValue(T t) {
        return t;
    }

    public DynamicArray() {
        this.array = null;
    }

    public DynamicArray(T[] array) {
        this.array = array;
        this.length = array.length;
    }

    public void add(T t) {
        T[] temp = Arrays.copyOf(array, array.length + 1);
        temp[temp.length - 1] = t;
        array = temp;
        length++;
    }

    public void delete(int index) {

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
        length--;
    }

    public void deleteVaues(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                delete(i);
                i++;
            }
        }
    }

    public T min() {
        T min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T max() {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T sum() {
        if (array[0] instanceof Number) {
            Number sum = 0;
            for (T t : array) {
                sum = numbersSum(sum, (Number) t);
            }
            return (T) sum;
        }
        if (array[0] instanceof String) {
            StringBuilder sb = new StringBuilder();
            for (T t : array) {
                sb.append(t);
            }
            return (T) sb.toString();
        }
        return null;
    }

    public T mult() {
        if (array[0] instanceof Number mult) {

            for (int i = 1; i < array.length; i++) {
                System.out.printf("%s * %s = ", mult, array[i]);
                mult = mult((Number) array[i], mult);
                System.out.println(mult);
            }
            return (T) mult;
        } else
            return null;
    }

    public int findIndex(T el) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (el.equals(array[i]))
                return i;
        }
        return index;
    }

    public boolean contains(T el) {
        for (T t : array) {
            if (t.equals(el)) {
                return true;
            }
        }
        return false;
    }

    public DynamicArray<T> bubleSort() {
        T[] tempArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < tempArray.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < tempArray.length - 1 - i; j++) {
                if (tempArray[i].compareTo(tempArray[i + 1]) > 0) {
                    T temp = tempArray[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArray[i + 1] = temp;
                    flag = 1;
                }
                if (flag == 0)
                    return new DynamicArray<>(tempArray);
            }
        }
        return new DynamicArray<>(tempArray);

    }

    public DynamicArray<T> insertionSort() {
        T[] tempArray = Arrays.copyOf(array, array.length);
        for (int i = 1; i < tempArray.length; i++) {
            T key = tempArray[i];
            int j = i - 1;
            while (j >= 0 && tempArray[j].compareTo(key) > 0) {
                tempArray[j + 1] = tempArray[j];
                j -= 1;
            }
            tempArray[j + 1] = key;
        }
        return new DynamicArray<>(tempArray);
    }

    public DynamicArray<T> selectionSort() {
        T[] tempArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < tempArray.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j].compareTo(tempArray[min]) < 0) {
                    min = j;
                }
            }
            T temp = tempArray[min];
            tempArray[min] = tempArray[i];
            tempArray[i] = temp;
        }
        return new DynamicArray<>(tempArray);
    }

    public int getIndex(T el) {

        for (int i = 0; i < array.length; i++) {
            if (el.equals(array[i]))
                return i;
        }
        return -1;
    }

    public void setValue(T el, int index) {
        array[index] = el;
    }

    public int size() {
        return length;
    }

    @Override
    public String toString() {
        // String str = "";
        StringBuffer sb = new StringBuffer();

        for (T t : array) {
            // str += String.format("%s ", String.valueOf(t));
            sb.append(t);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public Number numbersSum(Number f, Number s) {
        return f.doubleValue() + s.doubleValue();
    }

    @Override
    public Number mult(Number f, Number s) {
        return f.doubleValue() * s.doubleValue();
    }

}
