package HW1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Demo {

    public static void main(String[] args) {
        doTaskOne();
        doTaskTwo();
        doBigTask();
    }
    public static void doBigTask(){
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println(appleBox.getBoxWeight());
        System.out.println(orangeBox.getBoxWeight());
        appleBox.moveAllToAnotherBox(appleBox1);
        System.out.println(appleBox1.getBoxWeight());
        System.out.println(appleBox.getBoxWeight());
        System.out.println("Коробки одинаковы по весу: " + appleBox1.compare(appleBox1));
        System.out.println("Коробки одинаковы по весу: " + appleBox.compare(orangeBox));



    }

    public static void doTaskOne(){
        Integer[] iArray = {1, 2, 3, 4, 5};
        swapElementsInArray(iArray, 2, 3);
        System.out.println(Arrays.toString(iArray));

        String[] strArray = {"A", "B", "C", "D", "E"};
        swapElementsInArray(strArray, 1,4);
        System.out.println(Arrays.toString(strArray));
    }
    public static <T> void swapElementsInArray(T array[], int indexOne, int indexTwo) {

        try {
            T tmp = array[indexOne];
            array[indexOne] = array[indexTwo];
            array[indexTwo] = tmp;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
    }
    public static void doTaskTwo() {

        Integer[] iArray = {1, 2, 3, 4, 5};
        System.out.println(transformArrayToArrayList(iArray));

        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println(transformArrayToArrayList(strArray));
    }

    public static <T> List<T> transformArrayToArrayList(T[] array) {

        List<T> arrayList = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}


