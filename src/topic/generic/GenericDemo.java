package topic.generic;

import java.lang.reflect.Array;

public class GenericDemo {
    public static <T> void printArray (T[] inputArray){
        for (T element:inputArray) {
            System.out.printf("\t %s",element);
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> void compareArrayElement (T[] inputArray){
        for (T element:inputArray) {
            System.out.printf("\t %s", element);
        }
        System.out.println(" \t compare first 2 object in array "+ inputArray[0].compareTo(inputArray[1]));

    }
    public static void main (String[] args){
        Integer[] intArray = new Integer[] {2,2,3,4};
        String[] strArray = new String[] {"one", "ond", "three", "four"};
        printArray(intArray);
        printArray(strArray);
        compareArrayElement(intArray); //compare 2 and 2
        compareArrayElement(strArray); // compare one and ond

        // demo generic Class
        //using integer Array list
        GenericArray<Integer> intArrayGeneric = new GenericArray<>();
        intArrayGeneric.addElement(5);
        intArrayGeneric.addElement(6);
        intArrayGeneric.addElement(7);
        System.out.println("print Integer Array List using generic class");
        intArrayGeneric.printArrayList( intArrayGeneric);

        // using string arrayList
        GenericArray<String> strArrayGeneric = new GenericArray<>();
        strArrayGeneric.addElement("five");
        strArrayGeneric.addElement("six");
        strArrayGeneric.addElement("seven");
        System.out.println("print String Array List using generic class");
        strArrayGeneric.printArrayList(strArrayGeneric);
    }
}
